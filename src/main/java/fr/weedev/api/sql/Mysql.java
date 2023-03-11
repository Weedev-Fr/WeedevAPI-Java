package fr.weedev.api.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Mysql {

    // SPECIFY OPTION
    private String dbName;
    private String dbPassword;
    private int port;
    private String url;
    private String username;
    private String password;

    // LOCAL, NO MODIFY IN OPTION
    private Connection con;
    private String urlConnection;

    public Mysql(String dbName, String username, String password, int port, String url) {
        this.dbName = dbName;
        this.username = username;
        this.password = password;
        this.port = port;
        this.url = url;
        urlConnection = "jdbc:mysql://"+url+":"+port+"/"+dbName;
    }

    public boolean isConnected() throws SQLException { return con != null; }

    public void openConnection() {
        try {
            con = DriverManager.getConnection(urlConnection, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection() {
        try {
            if (isConnected()) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
