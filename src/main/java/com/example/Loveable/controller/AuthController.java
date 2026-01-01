package com.example.Loveable.controller;

import com.example.Loveable.dto.auth.AuthResponse;
import com.example.Loveable.dto.auth.LoginRequest;
import com.example.Loveable.dto.auth.SignUpRequest;
import com.example.Loveable.dto.auth.UserProfileResponse;
import com.example.Loveable.service.AuthService;
import com.example.Loveable.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private AuthService authService;
    private UserService userService;
    @PostMapping("/signup")
    public ResponseEntity<AuthResponse>signup(SignUpRequest request){
          return ResponseEntity.ok(authService.signup(request));
    }
    @PostMapping("/login")
    public ResponseEntity<AuthResponse>login(LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }
    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse>getProfile(){
         Long userId=1L;
         return ResponseEntity.ok(userService.getProfile(userId));
    }
}
