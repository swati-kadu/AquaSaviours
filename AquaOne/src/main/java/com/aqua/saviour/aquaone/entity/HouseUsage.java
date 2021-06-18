package com.aqua.saviour.aquaone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "AQUA_USAGE")
public class HouseUsage {

    @Id
    private String houseId;

    @Column(name = "DEVICE_ID", length = 50, nullable = false, unique = false)
    private String deviceId;

    @Column(name = "KITCHEN_USAGE", length = 50, nullable = false, unique = false)
    private int kitchenUsage;

    @Column(name = "BATHROOM_USAGE", length = 50, nullable = false, unique = false)
    private int bathroomUsage;

    @Column(name = "M_BATHROOM_USAGE", length = 50, nullable = false, unique = false)
    private int masterBathroomUsage;

    @Column(name = "D_BALCONY_USAGE", length = 50, nullable = false, unique = false)
    private int dryBalconyUsage;

    @Column(name = "BASIN_USAGE", length = 50, nullable = false, unique = false)
    private int basinUsage;

    @Column(name = "DATE_TIME")
    private Date dateTime;

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public int getKitchenUsage() {
        return kitchenUsage;
    }

    public void setKitchenUsage(int kitchenUsage) {
        this.kitchenUsage = kitchenUsage;
    }

    public int getBathroomUsage() {
        return bathroomUsage;
    }

    public void setBathroomUsage(int bathroomUsage) {
        this.bathroomUsage = bathroomUsage;
    }

    public int getMasterBathroomUsage() {
        return masterBathroomUsage;
    }

    public void setMasterBathroomUsage(int masterBathroomUsage) {
        this.masterBathroomUsage = masterBathroomUsage;
    }

    public int getDryBalconyUsage() {
        return dryBalconyUsage;
    }

    public void setDryBalconyUsage(int dryBalconyUsage) {
        this.dryBalconyUsage = dryBalconyUsage;
    }

    public int getBasinUsage() {
        return basinUsage;
    }

    public void setBasinUsage(int basinUsage) {
        this.basinUsage = basinUsage;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public HouseUsage() {
    }

    @Override
    public String toString() {
        return String.format("HouseUsage");
    }
}
