package com.smarthome.recommender.dto;

public class PlanRequestDto {

    private int bedrooms;
    private int bathrooms;
    private int kitchens;
    private int livingRooms;
    private boolean pooja;
    private boolean balcony;

    public PlanRequestDto() {
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getKitchens() {
        return kitchens;
    }

    public void setKitchens(int kitchens) {
        this.kitchens = kitchens;
    }

    public int getLivingRooms() {
        return livingRooms;
    }

    public void setLivingRooms(int livingRooms) {
        this.livingRooms = livingRooms;
    }

    public boolean isPooja() {
        return pooja;
    }

    public void setPooja(boolean pooja) {
        this.pooja = pooja;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }
}