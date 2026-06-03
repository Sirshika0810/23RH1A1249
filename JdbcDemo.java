import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to DB
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"   // change this
            );

            System.out.println("Database Connected!");

            // 3. Query
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            // 4. Read data
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}