package ro.ase.acs.interfaces;

import ro.ase.acs.classes.Employee;

import java.sql.Connection;
import java.sql.SQLException;

public interface InsertValueDefinition {

    void insertDataCreateStatement(Connection connection, Employee employee) throws SQLException;

    void insertDataPrepareStatement(Connection connection, Employee employee) throws SQLException;
}
