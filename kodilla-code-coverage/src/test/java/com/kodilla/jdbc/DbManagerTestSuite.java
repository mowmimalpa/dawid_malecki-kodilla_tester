//package com.kodilla.jdbc;
//
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.AbstractMap;
//import java.util.List;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeAll;
//import java.sql.SQLException;
//
//class DbManagerTestSuite {
//    private static DbManager dbManager;
//
//    @BeforeAll
//    public static void setup() throws SQLException {
//        dbManager = DbManager.getInstance();
//    }
//
//    @Test
//    void testConnect() {
//        //Given
//        //When
//        //Then
//        Assertions.assertNotNull(dbManager.getConnection());
//    }
//
//    @Test
//    void testSelectUsers() throws SQLException {
//        //Given
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getInt("ID") + ", " +
//                    rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        Assertions.assertEquals(5, counter);
//    }
//}