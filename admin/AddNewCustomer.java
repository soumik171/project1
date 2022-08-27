package admin;

import info.*;
import Interface.*;
import java.util.Scanner;

public class AddNewCustomer {

    public static final int SCREEN_ID = 8;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AddNewCustomer(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(Customer[] customers) {
        int ind = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.print("Enter New Customer ID: ");
        int id = sc.nextInt();//takeInputInterface.takeIntInput(1, Integer.MAX_VALUE);
        System.out.print("Enter New Customer Name: ");
        String name = takeInputInterface.takeStringInput();
        System.out.print("Enter New Customer Address: ");
        String address = takeInputInterface.takeStringInput();
        System.out.print("Enter New Customer Phone: ");
        String phone = takeInputInterface.takeStringInput();
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                if (customers[i].getId() == id) {
                    System.out.println("Customer or ID already existed");
                    break;
                }
            } else {

                ind = i;

                Customer newCustomer = new Customer(id, name, address, phone);
                customers[ind] = newCustomer;
                System.out.println("Employee added successfully");
                navigationInterface.navigate(SCREEN_ID, 0);
                break;

            }
        }

    }
}
