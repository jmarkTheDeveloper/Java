package dao;

import models.Resident;
import config.DatabaseConfig;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.MongoWriteException;

public class ResidentDAO {
    private final MongoCollection<Document> collection;

    public ResidentDAO() {
        // Fetch the residents collection from our database configuration
        this.collection = DatabaseConfig.getCollection("residents");
    }

    /**
     * Inserts a new resident into the database.
     * 
     * @param resident The resident object to save.
     * @return true if insertion succeeded, false if duplicate ID or write error.
     */
    public boolean addResident(Resident resident) {
        try {
            // 1. Map your Resident OOP Java object to a BSON Document
            Document doc = new Document()
                    .append("_id", resident.getResidentId()) // Maps to MongoDB primary key _id
                    .append("firstname", resident.getFirstname())
                    .append("lastname", resident.getLastname())
                    .append("age", resident.getAge())
                    .append("status", resident.getStatus())
                    .append("employment_status", resident.getEmploymentStatus())
                    .append("home_type", resident.getHomeType());

            // 2. Perform the insert
            collection.insertOne(doc);
            System.out.println("Resident saved successfully to the database!");
            return true;

        } catch (MongoWriteException e) {
            // 3. Catch duplicate ID errors (error code 11000)
            if (e.getError().getCode() == 11000) {
                System.err.println("❌ Error: A resident with ID '" + resident.getResidentId() + "' already exists!");
            } else {
                System.err.println("❌ Database write error: " + e.getMessage());
            }
            return false;
        } catch (Exception e) {
            System.err.println("❌ Unexpected error saving resident: " + e.getMessage());
            return false;
        }
    }
}