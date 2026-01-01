package com.example.Loveable.service;

import com.example.Loveable.dto.auth.AuthResponse;
import com.example.Loveable.dto.auth.LoginRequest;
import com.example.Loveable.dto.auth.SignUpRequest;
import com.example.Loveable.dto.auth.UserProfileResponse;

public interface AuthService {

    AuthResponse signup(SignUpRequest request);
    AuthResponse login(LoginRequest request);

}
