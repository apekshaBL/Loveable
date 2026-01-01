package com.example.Loveable.entity;

import com.example.Loveable.enums.SubscriptionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Subscription {
    Long id;

    @ManyToOne
    User user;

    @OneToMany
    Plan plan;
    String stripeCustomerId;
    String stripeSubscriptionId;

    SubscriptionStatus status;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd;

    Instant createdAt;
    Instant updatedAt;

}
