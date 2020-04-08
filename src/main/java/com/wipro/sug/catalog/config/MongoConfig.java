package com.wipro.sug.catalog.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Value("${mongodb.uri}")
    private String uri;

    @Value("${mongodb.database}")
    private String database;

    @Bean
    public MongoClient mongo() {
        return MongoClients.create(uri);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), database);
    }

}
