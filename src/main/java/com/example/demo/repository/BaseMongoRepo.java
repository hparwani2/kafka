package com.example.demo.repository;

import com.example.demo.model.CSEDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BaseMongoRepo extends ReactiveMongoRepository<CSEDetails,Object>{

    @Query("{product_id : ?0}")
    public Flux<?> findByProductId(Mono<String> productId);
}
