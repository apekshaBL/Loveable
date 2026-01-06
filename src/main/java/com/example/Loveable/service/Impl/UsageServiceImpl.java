package com.example.Loveable.service.Impl;

import com.example.Loveable.dto.subscription.PlanLimitsResponse;
import com.example.Loveable.dto.subscription.UsageTodayResponse;
import com.example.Loveable.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
