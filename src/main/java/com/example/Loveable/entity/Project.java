package com.example.Loveable.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    Long id;
    String name;
    Long ownerId;
    Boolean isPublic=false;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
