package com.project.parkingsystem.parkingservice.commons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingEntityRepository extends JpaRepository<ParkingEntity, Long> {
    ParkingEntity findByName(String name);
}
