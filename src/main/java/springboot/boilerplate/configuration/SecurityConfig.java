package springboot.boilerplate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic(httpSecurityHttpBasicConfigurer -> {});

        return httpSecurity.build();
    }
}

