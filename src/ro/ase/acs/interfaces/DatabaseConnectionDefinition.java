package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseConnectionDefinition {

    public Connection connectionDefinition() throws SQLException, ClassNotFoundException;
}
