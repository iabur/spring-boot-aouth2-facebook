package com.practice.auth2facebooklogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class Auth2FacebookLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(Auth2FacebookLoginApplication.class, args);
    }

}
