package com.project.parkingsystem.parkingservice.parking;

import com.project.parkingsystem.parkingservice.commons.ParkingEntity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "parking_lot")
public class ParkingLot {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parking_entity_id", referencedColumnName = "id")
    private ParkingEntity parkingEntity;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;

    public ParkingLot() {
    }

    public ParkingLot(Long id, String name, ParkingEntity parkingEntity, LocalDateTime createdAt,
                      LocalDateTime lastUpdatedAt) {
        this.id = id;
        this.name = name;
        this.parkingEntity = parkingEntity;
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingEntity getParkingEntity() {
        return parkingEntity;
    }

    public void setParkingEntity(ParkingEntity parkingEntity) {
        this.parkingEntity = parkingEntity;
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