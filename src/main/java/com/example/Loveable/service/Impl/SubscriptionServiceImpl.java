package com.example.Loveable.service.Impl;

import com.example.Loveable.dto.subscription.CheckoutRequest;
import com.example.Loveable.dto.subscription.CheckoutResponse;
import com.example.Loveable.dto.subscription.PortalResponse;
import com.example.Loveable.dto.subscription.SubscriptionResponse;
import com.example.Loveable.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
