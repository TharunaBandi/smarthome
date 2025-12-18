package com.smarthome.recommender.dto;

import java.util.List;

public class PlanResponseDto {

    private int canvasWidth;
    private int canvasHeight;
    private List<String> imageNames;

    public PlanResponseDto() {
    }

    public PlanResponseDto(int canvasWidth, int canvasHeight, List<String> imageNames) {
        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;
        this.imageNames = imageNames;
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }

    public void setCanvasWidth(int canvasWidth) {
        this.canvasWidth = canvasWidth;
    }

    public int getCanvasHeight() {
        return canvasHeight;
    }

    public void setCanvasHeight(int canvasHeight) {
        this.canvasHeight = canvasHeight;
    }

    public List<String> getImageNames() {
        return imageNames;
    }

    public void setImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
    }
}