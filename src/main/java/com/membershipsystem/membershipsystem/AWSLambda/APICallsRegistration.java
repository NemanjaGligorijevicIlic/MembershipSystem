package com.membershipsystem.membershipsystem.AWSLambda;

import java.sql.*;

public class APICallsRegistration {
    private static final String RDS_JDBC_URL = "jdbc:mysql://membershipsystemdb.clgbxjdigu3v.us-east-1.rds.amazonaws.com:3306/MembershipSystemDB?useSSL=false&allowPublicKeyRetrieval=true&autoReconnect=true";
    private static final String RDS_USERNAME = "Nemanja";
    private static final String RDS_PASSWORD = "Pecopeco1.";

    public void handleRequest(Long memberId) throws SQLException {
        try (Connection connection = DriverManager.getConnection(RDS_JDBC_URL, RDS_USERNAME, RDS_PASSWORD)) {
            String sql = "INSERT INTO APICalls (idAPICalls, memberId) VALUES (DEFAULT, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setLong(1, memberId);
                preparedStatement.executeUpdate();

                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idAPICalls = generatedKeys.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
