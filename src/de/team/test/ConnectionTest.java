package de.team.test;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import de.team.execution.handlers.DBWorkSet;

public class ConnectionTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DBWorkSet ws = new DBWorkSet();
        ws.connect("192.168.43.44", JOptionPane.showInputDialog("Nutzer"), JOptionPane.showInputDialog("Passwort"));
        ws.excecuteQuery("select * from nutzer");
       
        try {
            while(ws.getResultset().next()) {
                System.out.println(ws.getResultset().getString("id") +", " + ws.getResultset().getString("email"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
    }

}

