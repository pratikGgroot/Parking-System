package com.project.parkingsystem.parkingservice.parking;
public class ParkingResponse {
    private String ticketId;
    private String parkingSpotId;
    private String entryTime;
    private String message;

    public ParkingResponse() {

    }

    public ParkingResponse(String message) {
        this.message = message;
    }

    public ParkingResponse(String ticketId, String parkingSpotId, String entryTime,
                           String message) {
        this.ticketId = ticketId;
        this.parkingSpotId = parkingSpotId;
        this.entryTime = entryTime;
        this.message = message;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(String parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}