package dao;

import models.UserAdmin;
import config.DatabaseConfig;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.MongoWriteException;
import static com.mongodb.client.model.Filters.eq;

public class UserAdminDAO {
    private final MongoCollection<Document> collection;

    public UserAdminDAO() {
        this.collection = DatabaseConfig.getCollection("user_admins");
    }

    public boolean addAdmin(UserAdmin admin) {
        try {
            Document document = new Document()
                    .append("adminName", admin.getAdminName())
                    .append("adminType", admin.getAdminType())
                    .append("password", admin.getPassword());
            collection.insertOne(document);
            System.out.println("Admin Saved Successfully!");
            return true;
        } catch (MongoWriteException e) {
            System.err.println("Database write error: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.err.println("Unexpected error saving admin: " + e.getMessage());
            return false;
        }
    }

    public UserAdmin authenticate(String adminName, String password) {
        try {
            Document document = collection.find(eq("adminName", adminName)).first();

            if (document != null) {
                String dbPassword = document.getString("password");

                if (dbPassword != null && dbPassword.equals(password)) {
                    return new UserAdmin(
                            document.getString("adminName"),
                            document.getString("adminType"),
                            dbPassword);
                }
            }
        } catch (Exception e) {
            System.err.println("Authentication error: " + e.getMessage());
        }
        return null;
    }
}
