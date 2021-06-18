package com.aqua.saviour.aquaone.response;

import java.sql.Date;

public class AquaUsageResponse {

    private String houseId;

    private String deviceId;

    private int kitchenUsage;

    private int bathroomUsage;

    private int masterBathroomUsage;

    private int dryBalconyUsage;

    private int basinUsage;

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

}
