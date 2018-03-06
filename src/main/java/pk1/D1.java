package pk1;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class D1 {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase db = mongoClient.getDatabase("test");
        System.out.println("连接成功");

    }

}

