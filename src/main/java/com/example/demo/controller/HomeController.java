package com.example.demo.controller;

import com.example.demo.model.CSEDetails;
import com.example.demo.repository.BaseMongoRepo;
import com.example.demo.response.CSEDetailsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController("/")
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private BaseMongoRepo baseMongoRepo;


    public Mono<ServerResponse> saveData(
             ServerRequest serverRequest) {

        return ServerResponse.ok().body(baseMongoRepo.saveAll(serverRequest.bodyToFlux(CSEDetails.class))
                .flatMap(a -> Flux.just(CSEDetailsResponse.convertToResponse(a))),CSEDetailsResponse.class);
    }

    public Mono<ServerResponse> getData(ServerRequest serverRequest)

    {
        Optional<String> optional = serverRequest.queryParam("id");
        return ServerResponse.ok().body(baseMongoRepo.findByProductId(Mono.just((optional.get()))).flatMap(a -> Flux.just(CSEDetailsResponse.convertToResponse((CSEDetails) a))),CSEDetailsResponse.class);

    }

    @GetMapping("/find/all")
    public Flux<CSEDetails> findAll() {
        return baseMongoRepo.findAll();
    }


}
