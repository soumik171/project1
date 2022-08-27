package admin;

import info.Customer;
import Interface.*;

public class RemoveCustomerScreen {

    public static final int SCREEN_ID = 9;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public RemoveCustomerScreen(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(Customer[] cust) {
        System.out.println("\n\n");
        System.out.print("Enter Customer ID: ");
        int id = takeInputInterface.takeIntInput(1, Integer.MAX_VALUE);

        for (int i = 0; i < cust.length; i++) {
            if (cust[i] != null) {
                if (cust[i].getId() == id) {
                    cust[i] = null;
                    System.out.println("Customer has removed");
                    break;
                }
            }
        }
        System.out.println("Saved Successfully!");
        navigationInterface.navigate(SCREEN_ID, 0);
    }

}
