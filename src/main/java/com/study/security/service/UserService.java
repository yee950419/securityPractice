package com.study.security.service;

import com.study.security.common.utils.JwtUtil;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${jwt.secretKey}")
    private String secretKey;

    private Long expiredMs = 1000 * 60 * 60L;

    public String login(String userName, String password) {

        // 인증 과정
        return JwtUtil.createJwt(userName, secretKey, expiredMs);
    }
}
