package com.example.Loveable.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {
    Long id;

    @ManyToOne
    User user;

    @ManyToOne
    Project project;

    String action;

    Integer tokensUsed;
    Integer durationMs;

    String metaData;
    Instant createdAt;

}
