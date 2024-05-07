import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hotel_DAL {

    private static final String DB_URL = "jdbc:mysql://localhost/hotelreservation";
    private static final String USER = "nilsu";
    private static final String PASS = "n123";

    public static void addHotel(int hotelid, String hotelName, String locaion, int numberofRooms) {
        String query = "INSERT INTO hotel (hotelId, hotelName, locaion, numberOfRooms) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, hotelid);
            statement.setString(2, hotelName);
            statement.setString(3, locaion);
            statement.setInt(4, numberofRooms);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Hotel added successfully.");
            } else {
                System.out.println("Failed to add hotel.");
            }
        } catch (SQLException e) {
            System.out.println("Error adding hotel: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Örnek kullanım
        addHotel(5, "Ex", "AR", 100);
    }
}
