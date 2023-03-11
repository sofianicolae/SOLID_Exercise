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
            System.out.println("Please insert the details of the 3 employees:");
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
                System.out.println("Employee's id: ");
                int id = scanner.nextInt();

                System.out.println("Employee's name: ");
                String name = scanner.next();

                System.out.println("Employee's address: ");
                String address = scanner.next();

                System.out.println("Employee's salary: ");
                float salary = scanner.nextFloat();

                Employee employee = new Employee(id, name, address, salary);
                insertData.insertDataCreateStatement(connection, employee);
            }
            ReadValues readData = new ReadValues();
            System.out.println("The employees' details are: ");
            readData.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}