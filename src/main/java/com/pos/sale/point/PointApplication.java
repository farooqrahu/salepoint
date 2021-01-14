package com.pos.sale.point;

import com.pos.sale.point.dto.UserDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableJpaRepositories
public class PointApplication {

    public static void main(String[] args) {
        SpringApplication.run(PointApplication.class, args);

    }


    @Bean
    public UserDto getUserDto() {
        return new UserDto();
    }

 /*   @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("PreDestroy");
    }*/



}
