package com.example.Loveable.dto.project;

import com.example.Loveable.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(Long id, String name, Instant createdAt, Instant updatedAt, UserProfileResponse owner) {

}
