package com.cs1951.mongo.dao;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;


@Component
public class CovidDao extends AbstractDao {
    public static String COVID_COLLECTION = "test_mac";

    private MongoCollection<Document> covidCollection;

    @Autowired
    public CovidDao(
            MongoClient mongoClient, @Value("${spring.mongodb.database}") String databaseName) {
        super(mongoClient, databaseName);
        covidCollection = db.getCollection(COVID_COLLECTION);
    }

    public Document getTest(String name) {
        Bson query = Filters.eq("name", name);
        return covidCollection
                .find(query)
                .iterator()
                .tryNext();
    }

    public List<Document> getAll() {
        List<Document> res = new ArrayList<>();
        covidCollection
                .find()
                .into(res);
        return res;
    }
}