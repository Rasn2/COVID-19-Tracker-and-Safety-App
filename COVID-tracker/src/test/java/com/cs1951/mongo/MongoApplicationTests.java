package com.cs1951.mongo;

import com.cs1951.mongo.dao.CovidDao;
import com.cs1951.mongo.dao.TicketTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class MongoApplicationTests extends TicketTest {

    @Before
    public void setup() throws IOException {
    }

    @Test
    void contextLoads() {
    }

}
