package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionData {

    public Connection connectionDefinition() throws SQLException, ClassNotFoundException;
}
