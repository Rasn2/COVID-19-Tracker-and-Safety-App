package com.cs1951.mongo.dao;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cs1951.config.MongoDBConfiguration;
import org.bson.Document;
import org.junit.Before;



import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {MongoDBConfiguration.class})
@EnableConfigurationProperties
@EnableAutoConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class CovidDaoTest extends TicketTest {

    private String mongoUri;
    private CovidDao dao;

    @Autowired
    MongoClient mongoClient;

    @Value("${spring.mongodb.database}")
    String databaseName;

    @Before
    public void setUp() throws IOException {
        mongoUri = getProperty("spring.mongodb.uri");
        this.dao = new CovidDao(mongoClient, databaseName);
    }

    @Test
    public void testConnection() throws IOException {
        List<Document> documents = dao.getAll();
        System.out.println(documents.size());
    }
}