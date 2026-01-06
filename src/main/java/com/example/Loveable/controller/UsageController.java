package com.example.Loveable.controller;

import com.example.Loveable.dto.subscription.PlanLimitsResponse;
import com.example.Loveable.dto.subscription.UsageTodayResponse;
import com.example.Loveable.service.UsageService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequestMapping("/api/usage")
public class UsageController {
    UsageService usageService;
    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse>getTodayUsage(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userId));
    }
    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponse>getPlanLimits(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }

}
