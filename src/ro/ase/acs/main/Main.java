package ro.ase.acs.main;


import ro.ase.acs.classes.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int NUMBER_OF_EMPLOYEES = 3;
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();

        try {
            Connection connection = databaseConnection.connectionDefinition();

            CreateTable createTable = new CreateTable();
            createTable.createTable(connection);

            InsertData insertData = new InsertData();
            Scanner scanner = new Scanner(System.in);
            for(int i=0; i < NUMBER_OF_EMPLOYEES; i++){
                int id = scanner.nextInt();
                String name = scanner.next();
                String address = scanner.next();
                float salary = scanner.nextFloat();
                Employee employee = new Employee(id, name, address, salary);
                insertData.insertDataCreateStatement(connection, employee);
            }
            ReadData readData = new ReadData();
            readData.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}