package com.project.parkingsystem.parkingservice.parking;
public class ParkingRequest {
    private String parkingEntityName;
    private String parkingLotName;
    private String vehicleType;


    public String getParkingEntityName() {
        return parkingEntityName;
    }

    public void setParkingEntityName(String parkingEntityName) {
        this.parkingEntityName = parkingEntityName;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
