/*

Only test purpose


package com.manning.spring.security.inaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class SecurityConfig {

  //@Bean
  UserDetailsService userDetailsService() {
    var user = User.withUsername("john")
            .password("12345")
            .authorities("read")
            .build();
    //
    return new InMemoryUserDetailsManager(user);
  }

  //@Bean
  PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }

  //@Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
            .httpBasic(Customizer.withDefaults())
            .authorizeHttpRequests(c -> c.anyRequest().permitAll()*/
/*.authenticated()*//*
)
            .build();
  }

}
*/
