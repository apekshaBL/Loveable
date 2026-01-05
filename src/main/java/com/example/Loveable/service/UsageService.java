package com.example.Loveable.service;

import com.example.Loveable.dto.subscription.PlanLimitsResponse;
import com.example.Loveable.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);
    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
