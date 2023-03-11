package ro.ase.acs.main;


import ro.ase.acs.classes.*;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    private static final int NUMBER_OF_EMPLOYEES = 3;

    public static void main(String[] args) {
        DatabaseDatabaseConnection databaseConnection = new DatabaseDatabaseConnection();

        try {
            Connection connection = databaseConnection.connectionDefinition();

            TableCreation createTable = new TableCreation();
            createTable.createTable(connection);

            InsertValue insertData = new InsertValue();
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
                int id = scanner.nextInt();
                String name = scanner.next();
                String address = scanner.next();
                float salary = scanner.nextFloat();
                Employee employee = new Employee(id, name, address, salary);
                insertData.insertDataCreateStatement(connection, employee);
            }
            ReadValues readData = new ReadValues();
            readData.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}