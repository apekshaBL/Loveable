package com.example.Loveable.service.Impl;

import com.example.Loveable.dto.auth.UserProfileResponse;
import com.example.Loveable.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
