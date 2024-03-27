package com.project.parkingsystem.parkingservice.parking;

import com.project.parkingsystem.parkingservice.commons.ParkingSpot;
import com.project.parkingsystem.parkingservice.commons.ParkingSpotRepository;
import com.project.parkingsystem.parkingservice.commons.ParkingTicket;
import com.project.parkingsystem.parkingservice.commons.ParkingTicketRepository;
import com.project.parkingsystem.parkingservice.commons.ParkingEntity;
import com.project.parkingsystem.parkingservice.commons.ParkingEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ParkingService {

    private final ParkingLotRepository parkingLotRepository;
    private final ParkingEntityRepository parkingEntityRepository;
    private final ParkingSpotRepository parkingSpotRepository;
    private final ParkingTicketRepository parkingTicketRepository;
    private final VehicleTypeRepository vehicleTypeRepository;

    @Autowired
    public ParkingService(ParkingLotRepository parkingLotRepository,
                          ParkingEntityRepository parkingEntityRepository,
                          ParkingSpotRepository parkingSpotRepository,
                          ParkingTicketRepository parkingTicketRepository,
                          VehicleTypeRepository vehicleTypeRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingEntityRepository = parkingEntityRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingTicketRepository = parkingTicketRepository;
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    public ParkingResponse parkVehicle(ParkingRequest request) {
        ParkingEntity parkingEntity = parkingEntityRepository.findByName( request.getParkingEntityName() );
        if (parkingEntity == null) {
            return new ParkingResponse( "Parking entity not found" );
        }
        ParkingLot lot = parkingLotRepository.findByNameAndParkingEntityId( request.getParkingLotName(), parkingEntity.getId() );

        if (lot == null) {
            return new ParkingResponse( "Parking lot not found" );
        }

        VehicleType vehicleType = vehicleTypeRepository.findByName( request.getVehicleType() );
        if (vehicleType == null) {
            return new ParkingResponse( "Vehicle type not found" );
        }

        Optional<ParkingSpot> optionalParkingSpot = parkingSpotRepository.findFirstByParkingLotIdAndVehicleTypeIdAndOccupiedFalse( lot.getId(), vehicleType.getId() );

        if (optionalParkingSpot.isEmpty()) {
            return new ParkingResponse( "No available parking spot" );
        }

        ParkingSpot parkingSpot = optionalParkingSpot.get();

        parkingSpot.setOccupied( true );
        parkingSpotRepository.save( parkingSpot );

        ParkingTicket parkingTicket = new ParkingTicket();
        parkingTicket.setParkingSpot( parkingSpot );
        parkingTicket.setEntryTime( LocalDateTime.now() );
        parkingTicket.setCreatedAt( LocalDateTime.now() );
        parkingTicket.setLastUpdatedAt( LocalDateTime.now() );
        parkingTicketRepository.save( parkingTicket );

        ParkingResponse response = new ParkingResponse();
        response.setTicketId( parkingTicket.getId().toString() );
        response.setParkingSpotId( parkingSpot.getId().toString() );
        response.setEntryTime( parkingTicket.getEntryTime().toString() );
        //response.setMessage( "vehicle is parked" );
        return response;
    }
}