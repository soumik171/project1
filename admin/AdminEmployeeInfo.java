package admin;

import info.Employee;
import Interface.*;

public class AdminEmployeeInfo {

    public static final int SCREEN_ID = 4;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AdminEmployeeInfo(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(Employee[] e) {
        System.out.println("\n\n");
        System.out.println("-------------------------------");
        System.out.println("|          Employees          |");
        System.out.println("-------------------------------");

        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                System.out.println("ID: " + e[i].getId() + ", Name: " + e[i].getName() + ", Salary:" + e[i].getSalary());
            }

        }
        System.out.println("\n");

        if (e == null) {
            System.out.println("## No Employees Found.\n");
        }

        System.out.println("1. Add new Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        navigationInterface.navigate(SCREEN_ID, takeInputInterface.takeIntInput(1, 4));
    }
}
