package admin;

import Interface.*;

public class AdminAccess {

    public static final int SCREEN_ID = 3;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AdminAccess(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen() {
        System.out.println("\n\n");
        System.out.println("-------------------------------");
        System.out.println("|        Welcome Admin        |");
        System.out.println("-------------------------------");

        System.out.println("\n1. Employee Information");
        System.out.println("2. Customer Information");
        System.out.println("3. Storehouse Information");
        System.out.println("4. Back");
        System.out.println("5. Exit");

        navigationInterface.navigate(SCREEN_ID, takeInputInterface.takeIntInput(1, 5));
    }
}
