package config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DatabaseConfig {
    private static final MongoClient mongoClient;
    private static final MongoDatabase database;

    private static final String CONNECTION_STRING = "mongodb+srv://jaemarkalmeria08_db_user:LoodlkLNr7HH167R@barangaymanagementsyste.nomfcuz.mongodb.net/?appName=BarangayManagementSystems";
    private static final String DATABASE_NAME = "barangay_db";

    static {
        try {
            mongoClient = MongoClients.create(CONNECTION_STRING);
            database = mongoClient.getDatabase(DATABASE_NAME);
            System.out.println("Connected to MongoDB Atlas Successfully!");
        } catch (Exception e) {
            System.err.println("Failed to Connect to MongoDB: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }

    public static void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("MongoDB Connection closed");
        }
    }
}
