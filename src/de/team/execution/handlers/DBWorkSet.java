package de.team.execution.handlers;

import java.sql.*;

public class DBWorkSet {

    private String ip;
    private Connection conn;
    private Statement stmt;
    private ResultSet rsltst;

    public void connect(String ip, String user, String pw) {
        try {
            this.ip = ip;
            String adress = "jdbc:mysql://" + ip + ":3306/panschnack";
            conn = DriverManager.getConnection(adress, user, pw);
            stmt = conn.createStatement();
            System.out.println("Verbindung konnte erfolgreich hergestellt werden");
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void excecuteQuery(String query) {

        try {

            rsltst = stmt.executeQuery(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
   
    public void excecuteUpdate(String update) {
        try {
            stmt.executeUpdate(update);
           
        } catch (SQLException e) {
           
            System.out.println("Der Code ist fehlerhaft!!111");
        }
    }
   
    public ResultSet getResultset() {
        return rsltst;
    }
}