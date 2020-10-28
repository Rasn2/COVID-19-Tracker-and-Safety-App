package com.cs1951.mongo.dao;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Configuration
public abstract class AbstractDao {
    protected final String THE_DATABASE;
    protected MongoDatabase db;
    protected MongoClient mongoClient;
    @Value("${spring.mongodb.uri}")
    private String connectionString;

    protected AbstractDao(MongoClient mongoClient, String databaseName) {
        this.mongoClient = mongoClient;
        THE_DATABASE = databaseName;
        this.db = this.mongoClient.getDatabase(THE_DATABASE);
    }


}
