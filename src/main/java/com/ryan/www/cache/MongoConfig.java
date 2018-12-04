package com.ryan.www.cache;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Ryan on 2018/12/4.
 */
@Configuration
@EnableMongoRepositories("com.ryan.www.dao.mongo")
public class MongoConfig extends AbstractMongoConfiguration {
    @Value("${spring.data.mongodb.host}")
    private String mongoHost;
    @Value("${spring.data.mongodb.database}")
    private String dataBase;

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(mongoHost);
    }

    @Override
    protected String getDatabaseName() {
        return dataBase;
    }
}
