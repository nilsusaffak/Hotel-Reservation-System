import java.sql.*;


public class User_DAL {

    private static final String DB_URL = "jdbc:mysql://localhost/hotelreservation";
    private static final String USER = "nilsu";
    private static final String PASS = "n123";

    public static void addUser(int userid, String firstName, String lastName, String password) {
        String query = "INSERT INTO User (userId, firstName, lastName, password) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, userid);
            statement.setString(2, firstName);
            statement.setString(3, lastName);
            statement.setString(4, password);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User added successfully.");
            } else {
                System.out.println("Failed to add user.");
            }
        } catch (SQLException e) {
            System.out.println("Error adding user: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Örnek
        addUser(5, "Jo", "De", "67");
    }
}


