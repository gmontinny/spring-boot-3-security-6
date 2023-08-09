package com.gmontinny.service;

import com.gmontinny.dao.request.SignUpRequest;
import com.gmontinny.dao.request.SigninRequest;
import com.gmontinny.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
