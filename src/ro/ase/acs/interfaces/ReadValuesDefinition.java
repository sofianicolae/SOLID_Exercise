package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface ReadValuesDefinition {

    void readData(Connection connection) throws SQLException;
}
