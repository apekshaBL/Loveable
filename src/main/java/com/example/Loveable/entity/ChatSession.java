package com.example.Loveable.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {
    @ManyToOne
    Project project;

    @OneToOne
    User user;

    String title;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
