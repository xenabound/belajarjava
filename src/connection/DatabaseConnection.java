package connection;

import java.sql.*;

/**
 * Created by sukenda on 29/07/18.
 * Project Belajar
 */
public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            return new DatabaseConnection();
        } else {
            return instance;
        }
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = (Connection)
             DriverManager.getConnection("jdbc:mysql://localhost:3306/belajar",
                     "root", "root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
