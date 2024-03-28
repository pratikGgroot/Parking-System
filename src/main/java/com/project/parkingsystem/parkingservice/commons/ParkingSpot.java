package com.project.parkingsystem.parkingservice.commons;

import com.project.parkingsystem.parkingservice.parking.ParkingLot;
import com.project.parkingsystem.parkingservice.parking.VehicleType;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "parking_spot")
public class ParkingSpot {
    @Id
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parking_lot_id", referencedColumnName = "id")
    private ParkingLot parkingLot;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_type_id", referencedColumnName = "id")
    private VehicleType vehicleType;

    @Column(name = "is_occupied")
    private boolean occupied;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;

    public ParkingSpot() {
    }

    public ParkingSpot(Long id, ParkingLot parkingLot, VehicleType vehicleType, boolean occupied,
                       LocalDateTime createdAt, LocalDateTime lastUpdatedAt) {
        this.id = id;
        this.parkingLot = parkingLot;
        this.vehicleType = vehicleType;
        this.occupied = occupied;
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Long getId() {
        return id;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
}
