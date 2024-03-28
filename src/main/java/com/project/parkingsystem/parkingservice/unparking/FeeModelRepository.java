package com.project.parkingsystem.parkingservice.unparking;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FeeModelRepository extends JpaRepository<FeeModel, Long> {

    List<FeeModel> findByParkingEntityIdAndVehicleTypeId(Long parkingLotId, Long vehicletypeId);

}
