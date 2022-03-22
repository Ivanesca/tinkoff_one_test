package com.example.tinkoff_one_test;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.mapping.event.BeforeSaveEvent;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.UUID;
@ComponentScan
@EnableScheduling
@Configuration
public class AppConfig {
    @Bean
    public ApplicationListener<BeforeSaveEvent> idGenerator() {
        return event -> {
            var entity = event.getEntity();
            if (entity instanceof Student) {
                ((Student) entity).setId(UUID.randomUUID());
            }
        };
    }
}
