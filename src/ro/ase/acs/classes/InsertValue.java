package ro.ase.acs.classes;

import ro.ase.acs.interfaces.InsertValueDefinition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValue implements InsertValueDefinition {

    @Override
    public void insertDataCreateStatement(Connection connection, Employee employee) throws SQLException {
        String sqlInsert = "INSERT INTO employees VALUES(%d, '%s', '%s', %f)";
        String queryToInsertData = String.format(sqlInsert, employee.getId(), employee.getName(), employee.getAddress(), employee.getSalary());
        Statement statement = connection.createStatement();
        statement.executeUpdate(queryToInsertData);
        statement.close();

        connection.commit();
    }

    @Override
    public void insertDataPrepareStatement(Connection connection, Employee employee) throws SQLException {
        String sqlInsertWithParams = "INSERT INTO employees VALUES (?,?,?,?)";
        PreparedStatement preparedStatement =
                connection.prepareStatement(sqlInsertWithParams);
        preparedStatement.setInt(1, employee.getId());
        preparedStatement.setString(2, employee.getName());
        preparedStatement.setString(3, employee.getAddress());
        preparedStatement.setDouble(4, employee.getSalary());
        preparedStatement.executeUpdate();
        preparedStatement.close();

        connection.commit();
    }
}
