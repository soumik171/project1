package admin;

import info.Customer;
import Interface.*;

public class AdminCustomerInfo {

    public static final int SCREEN_ID = 7;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AdminCustomerInfo(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(Customer[] cust) {
        System.out.println("\n\n");
        System.out.println("-------------------------------");
        System.out.println("|          Customers          |");
        System.out.println("-------------------------------");

        for (int i = 0; i < cust.length; i++) {
            if (cust[i] != null) {
                System.out.println("ID: " + cust[i].getId() + ", Name: " + cust[i].getName() + ", Address: " + cust[i].getAddress() + ", Phone: " + cust[i].getPhone());
            }
        }

        System.out.println("\n");

        if (cust == null) {
            System.out.println("## No Customers Found.\n");
        }

        System.out.println("1. Add new Customer");
        System.out.println("2. Remove Customer");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        navigationInterface.navigate(SCREEN_ID, takeInputInterface.takeIntInput(1, 4));
    }
}
