package databaseapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static DBConnection MindaSpot = null;

    private String HOST = "127.0.0.1:3306";
    private String DB_NAME = "mindaSpot";
    private String USER = "mindaSpot";
    private String PASSWORD = "minderaschool";

    Connection con = null;

    private DBConnection() {
    }

    public static DBConnection getCon() {
        if (MindaSpot == null) {
            MindaSpot = new DBConnection();
        }

        return MindaSpot;
    }

    public void openConnection() {
        try {
            System.out.printf("Connecting to database %s...%n", DB_NAME);

            con = DriverManager.getConnection(String.format("jdbc:mysql://%s/%s", HOST, DB_NAME), USER, PASSWORD);

            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.printf("SQLException: %s%n", e.getMessage());
            System.out.printf("SQLState: %s%n", e.getSQLState());
            System.out.printf("VendorError: %s%n", e.getErrorCode());
            e.printStackTrace();
        }
    }

    public void  closeConnection() {
        try {
            System.out.println("Closing connected...");
            con.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
