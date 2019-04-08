package org.dat18c.ships_and_sails.shipsandsails.DatabaseHandler;

import java.sql.*;

public class DBExecute {
    private DBConnection conn = new DBConnection();
    private Statement st;
    private ResultSet res;

    public DBExecute() {
        try {
            st = conn.newConnection().createStatement();
        }

        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //metode til at returnere et resultsæt fra et select statement
    public ResultSet executeSelect() {
        String select = queries.getQuery();
        try
        {
            res = st.executeQuery(select);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return res;
    }

    public void executeClose(){
        conn.closeConnection();
    }


}