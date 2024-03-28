package com.project.parkingsystem.parkingservice.unparking;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MallFeeCalculator implements FeeCalculator {
    public double calculateFee(Long hours, List<FeeModel> feeModels) {
        double totalFee = 0;
        double duration = hours;

        for (FeeModel feeModel : feeModels) {
            totalFee += duration * feeModel.getHourlyRate();
        }

        return totalFee;
    }
}
