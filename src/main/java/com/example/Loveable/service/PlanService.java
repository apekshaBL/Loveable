package com.example.Loveable.service;

import com.example.Loveable.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();

}
