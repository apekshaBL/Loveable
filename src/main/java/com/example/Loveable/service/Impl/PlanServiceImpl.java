package com.example.Loveable.service.Impl;

import com.example.Loveable.dto.subscription.PlanResponse;
import com.example.Loveable.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
