package admin;

import Interface.NavigationInterface;
import Interface.TakeInputInterface;

public class StartScreen {

    public static final int SCREEN_ID = 1;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public StartScreen(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen() {
        System.out.println("\t###############################");
        System.out.println("\t# ------Welcome to DARAZ------#");
        System.out.println("\t###############################");

        System.out.println("Please choose an option between (1-3) to continue-->");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Exit");

        navigationInterface.navigate(SCREEN_ID, takeInputInterface.takeIntInput(1, 3));
    }
}
