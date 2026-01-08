package com.example.Loveable.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

//@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMemberId {
    Long projectId;
    Long userId;
}
