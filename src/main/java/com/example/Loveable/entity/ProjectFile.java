package com.example.Loveable.entity;

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
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {
    Long id;

    @OneToMany
    Project project;

    String path;

    String minioObjectKey;

    @ManyToOne
    User createdBy;

    @ManyToOne
    User updatedBy;

    Instant createdAt;

    Instant updatedAt;
}
