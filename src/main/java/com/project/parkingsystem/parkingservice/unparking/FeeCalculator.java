package com.project.parkingsystem.parkingservice.unparking;

import java.util.List;

public interface FeeCalculator {
    double calculateFee(Long hours, List<FeeModel> feeModels);

}
