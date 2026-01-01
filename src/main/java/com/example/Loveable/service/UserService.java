package com.example.Loveable.service;

import com.example.Loveable.dto.auth.UserProfileResponse;

public interface UserService {

    UserProfileResponse getProfile(Long userId);
}
