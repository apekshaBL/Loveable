package com.example.Loveable.service.Impl;

import com.example.Loveable.dto.auth.AuthResponse;
import com.example.Loveable.dto.auth.LoginRequest;
import com.example.Loveable.dto.auth.SignUpRequest;
import com.example.Loveable.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignUpRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
