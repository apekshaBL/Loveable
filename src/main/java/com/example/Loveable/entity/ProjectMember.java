package com.example.Loveable.entity;

import com.example.Loveable.enums.ProjectRole;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    ProjectMemberId id;

    @OneToMany
    Project project;

    @OneToMany
    User user;

    ProjectRole role;

    Instant invitedAt;
    Instant acceptedAt;
}
