package admin;

import info.*;
import Interface.*;

public class AddNewEmployee {

    public static final int SCREEN_ID = 5;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AddNewEmployee(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(Employee[] employees) {
        int ind = 0;
        System.out.println("\n\n");
        System.out.print("Enter New Employee ID: ");
        int id = takeInputInterface.takeIntInput(1, Integer.MAX_VALUE);
        System.out.print("Enter New Employee Name: ");
        String name = takeInputInterface.takeStringInput();
        System.out.print("Enter New Employee Salary: ");
        String salary = takeInputInterface.takeStringInput();
        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null) {
                if (employees[i].getId() == id) {
                    System.out.println("Employee or ID already existed");
                    break;
                }
            } else {

                ind = i;

                Employee newEmployee = new Employee(id, name, salary);

                employees[ind] = newEmployee;
                System.out.println("Employee added successfully");
                navigationInterface.navigate(SCREEN_ID, 0);
                break;

            }
        }

    }
}
