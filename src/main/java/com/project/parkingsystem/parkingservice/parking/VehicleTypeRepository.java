package com.project.parkingsystem.parkingservice.parking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Long> {

    VehicleType findByName(String vehicleTypeName);
}
