package org.dat18c.ships_and_sails.shipsandsails.DatabaseHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
    public Connection newConnection() {
        try {
            conn = DriverManager.getConnection(dbSetup.getDbUrl(), dbSetup.getUsername(), dbSetup.getPassword());
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }

Connection conn;
DBSetup dbSetup;

public DBConnection() {
    dbSetup = new DBSetup();
}

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
