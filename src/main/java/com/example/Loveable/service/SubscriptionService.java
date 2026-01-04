package com.example.Loveable.service;

import com.example.Loveable.dto.subscription.CheckoutRequest;
import com.example.Loveable.dto.subscription.CheckoutResponse;
import com.example.Loveable.dto.subscription.PortalResponse;
import com.example.Loveable.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);
    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);
    PortalResponse openCustomerPortal(Long userId);
}
