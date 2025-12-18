package com.smarthome.recommender.service;

import com.smarthome.recommender.dto.PlanRequestDto;
import com.smarthome.recommender.dto.PlanResponseDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlanService {

    private static final int CANVAS_WIDTH = 900;
    private static final int CANVAS_HEIGHT = 600;

    public PlanResponseDto generatePlan(PlanRequestDto request) {

        int beds = request.getBedrooms();
        List<String> imageNames;

        if (beds <= 1) {
            imageNames = Arrays.asList(
                    "1b_Plan.jpg"
            );
        } else if (beds == 2) {
            imageNames = Arrays.asList(
                    "2b.jpg",
                    "2d_2b(2).jpg"
            );
        } else {
            // 3 or more → all 3BHK 2D + 3D images
            imageNames = Arrays.asList(
                    "3d_3bhk(1).png",
                    "3d_3bhk(3).webp",
                    "3d_3bhk.webp"
            );
        }

        return new PlanResponseDto(CANVAS_WIDTH, CANVAS_HEIGHT, imageNames);
    }
}