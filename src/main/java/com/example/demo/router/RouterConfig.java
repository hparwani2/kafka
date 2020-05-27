package com.example.demo.router;

import com.example.demo.controller.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration
public class RouterConfig {


    @Autowired
    private HomeController homeController;

    @Bean
    public RouterFunction<?> routerFunction()
    {
        return RouterFunctions.route
                (GET("/get/data"), homeController::getData)
                .andRoute(POST("/save/data"),homeController::saveData);
    }
}
