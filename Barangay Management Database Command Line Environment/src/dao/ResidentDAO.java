package dao;

import models.Resident;
import config.DatabaseConfig;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.MongoWriteException;
import org.bson.conversions.Bson;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import static com.mongodb.client.model.Updates.combine;

public class ResidentDAO {
    private final MongoCollection<Document> collection;

    public ResidentDAO() {
        this.collection = DatabaseConfig.getCollection("resident");
    }

    public boolean addResident(Resident resident) {
        try {
            Document document = new Document()
                    .append("_id", resident.getResidentId())
                    .append("firstname", resident.getFirstname())
                    .append("lastname", resident.getLastname())
                    .append("age", resident.getAge())
                    .append("status", resident.getStatus())
                    .append("employment_status", resident.getEmploymentStatus())
                    .append("home_type", resident.getHomeType());
            collection.insertOne(document);
            System.out.println("Resident Saved Successfully to the database!");
            return true;
        } catch (MongoWriteException e) {
            if (e.getError().getCode() == 11000) {
                System.err.println("Error: A resident with ID " + resident.getResidentId() + " ");
            } else {
                System.err.println("Database write error: " + e.getMessage());
            }
            return false;
        } catch (Exception e) {
            System.out.println("Unexpected error saving residents: " + e.getMessage());
            return false;
        }
    }

    public Resident getResidentId(String residentId) {
        try {
            Document ResDocument = collection.find(eq("_id", residentId)).first();
            if (ResDocument == null)
                return null;

            return new Resident(
                    ResDocument.getString("_id"),
                    ResDocument.getString("firstname"),
                    ResDocument.getString("lastname"),
                    ResDocument.getInteger("age"),
                    ResDocument.getString("status"),
                    ResDocument.getString("employment_status"),
                    ResDocument.getString("home_type"));
        } catch (Exception e) {
            System.err.println("Error fetching resident: " + e.getMessage());
            return null;
        }
    }

    public boolean updateResidentStatus(String residentId, String newStatus, String newEmployment) {
        try {
            Bson updates = combine(
                    set("status", newStatus),
                    set("employment_status", newEmployment));
            UpdateResult result = collection.updateOne(eq("_id", residentId), updates);
            return result.getMatchedCount() > 0;
        } catch (Exception e) {
            System.err.println("Error Updating Resident: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteResidentSoft(String residentId) {
        try {
            DeleteResult result = collection.deleteOne(eq("_id", residentId));
            return result.getDeletedCount() > 0;
        } catch (Exception e) {
            System.err.println("Error hard-deleting resident: " + e.getMessage());
            return false;
        }
    }
}
