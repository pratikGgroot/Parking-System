package com.project.parkingsystem.parkingservice.unparking;

import java.time.LocalDateTime;

public class UnparkingResponse {

    public Long ticketId;

    public LocalDateTime entryTime;

    public LocalDateTime exitTime;

    public Double amount;

    private Long parkingSpotId;

    private String message;

    public UnparkingResponse() {
    }
    public UnparkingResponse(Long ticketId, LocalDateTime entryTime, LocalDateTime exitTime,
                             Double amount, Long parkingSpotId, String message) {
        this.ticketId = ticketId;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.amount = amount;
        this.parkingSpotId = parkingSpotId;
        this.message = message;
    }
    public UnparkingResponse(String message) {
        this.message = message;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(Long parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
