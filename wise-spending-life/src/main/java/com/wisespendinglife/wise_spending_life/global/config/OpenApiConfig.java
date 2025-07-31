package com.wisespendinglife.wise_spending_life.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Wise Spending Life API")
                        .version("v1.0.0")
                        .description("슬기로운 소비생활 플랫폼 백엔드 API 문서")
                        .contact(new Contact()
                                .name("Attack on Lion 팀")
                                .email("team@wise-spending.com")
                                .url("https://github.com/attack-on-lion/wise-spending-life")
                        )
                );
    }
}
