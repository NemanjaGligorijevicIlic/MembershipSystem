package org.example;

import java.sql.*;

public class APICallsRegistration {
    private static final String RDS_JDBC_URL = "jdbc:mysql://membershipsystemdb.clgbxjdigu3v.us-east-1.rds.amazonaws.com:3306/MembershipSystemDB";
    private static final String RDS_USERNAME = "Nemanja";
    private static final String RDS_PASSWORD = "Pecopeco1.";

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
