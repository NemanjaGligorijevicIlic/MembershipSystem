package org.example;

import java.sql.*;

public class APICallsRegistration {
    private static final String RDS_JDBC_URL = "TYPE_YOUR_VALUE";
    private static final String RDS_USERNAME = "TYPE_YOUR_VALUE";
    private static final String RDS_PASSWORD = "TYPE_YOUR_VALUE";

    public void handleRequest(Long memberId) {
        try (Connection connection = DriverManager.getConnection(RDS_JDBC_URL, RDS_USERNAME, RDS_PASSWORD)) {
            String sql = "INSERT INTO APICalls (idAPICalls, memberId) VALUES (DEFAULT, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setLong(1, memberId);
                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int idAPICalls = generatedKeys.getInt(1);
                            System.out.println("Successfully inserted row with idAPICalls: " + idAPICalls);
                        }
                    }
                } else {
                    System.out.println("Failed to insert row into APICalls");
                }
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
