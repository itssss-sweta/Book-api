package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.LoginDto;
import com.example.demo.dtos.RegisterDto;
import com.example.demo.model.LoginResponseModel;
import com.example.demo.model.ResponseModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.AuthenticationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<ResponseModel<UserModel>> signUpUser(@Valid @RequestBody RegisterDto newUser) {
        return authenticationService.signUp(newUser);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseModel<LoginResponseModel>> login(@Valid @RequestBody LoginDto credentials) {
        return authenticationService.login(credentials);
    }
}
