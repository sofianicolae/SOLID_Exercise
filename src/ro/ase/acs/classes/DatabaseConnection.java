package ro.ase.acs.classes;

import ro.ase.acs.interfaces.ConnectionData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements ConnectionData {
    @Override
    public Connection connectionDefinition() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        java.sql.Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
        connection.setAutoCommit(false);

        return connection;
    }
}
