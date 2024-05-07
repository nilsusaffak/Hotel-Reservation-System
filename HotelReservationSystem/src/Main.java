import java.sql.*;

public class Main {
    private static String user = "nilsu", pass = "n123";
    private static String conUrl = "jdbc:mysql://localhost/hotelreservation";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(conUrl, user, pass);
            ListNames(conn);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ListNames(Connection conn) {
        String command = "SELECT userid, firstName FROM `User`";
        try {
            System.out.println("Connected..");
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(command);
            int say = 0;
            while (res.next()) {
                int id = res.getInt("userid");
                String name = res.getString("firstName");
                System.out.printf("Id= %d, Name= %s%n", id, name);
                say++;
            }
            res.close();
            System.out.println("Result of select command: " + say);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
