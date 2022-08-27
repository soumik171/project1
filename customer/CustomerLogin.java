package customer;

import Interface.*;
import info.*;



public class CustomerLogin {


    public static final int SCREEN_ID = 11;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public CustomerLogin(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(Customer[] cus){
        Customer selectedCustomer = null;

        System.out.println("\n\n");
        System.out.println("Please Enter Your ID: ");

        int id = takeInputInterface.takeIntInput(1,Integer.MAX_VALUE);

        for (Customer c : cus){
            if (c.getId() == id){
                selectedCustomer = c;
                break;
            }
        }

        if (selectedCustomer != null){
            System.out.println("\n\n");
            System.out.println("Welcome Back "+selectedCustomer.getName());
            System.out.println("1. Continue");
            System.out.println("2. Back");
            System.out.println("3. Exit");

            navigationInterface.navigate(SCREEN_ID,takeInputInterface.takeIntInput(1,3));
        }else {
            System.out.println("Invalid ID! No customer Exists with ID "+id+". Please contact Admin!\n\n");
            navigationInterface.navigate(SCREEN_ID,0);
        }
    }
}
