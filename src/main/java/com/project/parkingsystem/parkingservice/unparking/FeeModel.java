package com.project.parkingsystem.parkingservice.unparking;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fee_model")
public class FeeModel {

    @Id
    private Long id;

    @Column(name = "parking_entity_id")
    private Long parkingEntityId;

    @Column(name = "vehicle_type_id")
    private Long vehicleTypeId;

    @Column(name = "is_start_inclusive")
    private boolean startInclusive;

    @Column(name = "start")
    private Long start;

    @Column(name = "end")
    private Long end;

    @Column(name = "is_end_inclusive")
    private boolean endInclusive;

    @Column(name = "base_fee")
    private double baseFee;

    @Column(name = "hourly_rate")
    private double hourlyRate;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "last_updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime lastUpdatedAt;

    public FeeModel() {
    }

    public FeeModel(Long id, Long parkingEntityId, Long vehicleTypeId, boolean startInclusive,
                    Long start, Long end, boolean endInclusive, double baseFee,
                    double hourlyRate, LocalDateTime createdAt, LocalDateTime lastUpdatedAt) {
        this.id = id;
        this.parkingEntityId = parkingEntityId;
        this.vehicleTypeId = vehicleTypeId;
        this.startInclusive = startInclusive;
        this.start = start;
        this.end = end;
        this.endInclusive = endInclusive;
        this.baseFee = baseFee;
        this.hourlyRate = hourlyRate;
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParkingEntityId() {
        return parkingEntityId;
    }

    public void setParkingEntityId(Long parkingEntityId) {
        this.parkingEntityId = parkingEntityId;
    }

    public Long getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Long vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public boolean isStartInclusive() {
        return startInclusive;
    }

    public void setStartInclusive(boolean startInclusive) {
        this.startInclusive = startInclusive;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public boolean isEndInclusive() {
        return endInclusive;
    }

    public void setEndInclusive(boolean endInclusive) {
        this.endInclusive = endInclusive;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
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

