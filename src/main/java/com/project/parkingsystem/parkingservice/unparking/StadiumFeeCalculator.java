package com.project.parkingsystem.parkingservice.unparking;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumFeeCalculator implements FeeCalculator {

    @Override
    public double calculateFee(Long hours, List<FeeModel> feeModels) {
        double totalFee = 0;
        double duration = hours;

        for (FeeModel feeModel : feeModels) {
            if (feeModel.getStart() <= hours) {
                totalFee += feeModel.getBaseFee();
                if (feeModel.getEnd() != null) {
                    if (feeModel.getEnd() <= hours) {
                        double sub = feeModel.getEnd() - feeModel.getStart();
                        duration -= sub;
                    }
                }
            }
            totalFee += duration * feeModel.getHourlyRate();
        }
        return totalFee;
    }
}
