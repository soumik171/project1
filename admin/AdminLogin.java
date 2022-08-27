package admin;

import Interface.*;
import java.util.Scanner;

public class AdminLogin  {
    private static final String ADMIN_USERNAME = "over";
    private static final String ADMIN_PASSWORD = "1234";

    public static final int SCREEN_ID = 2;
     
    //Association between Interface and AdminLogin
    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AdminLogin(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(){
        System.out.println("\n\n\n");
        System.out.println("Please Enter Your Credentials: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("User Name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (userName != null && password != null){
            if (userName.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)){
                navigationInterface.navigate(SCREEN_ID, 0);
            }else {
                System.out.println("Invalid Username Or Password");

                System.out.println("1. Try Again");
                System.out.println("2. Back");
                navigationInterface.navigate(SCREEN_ID, takeInputInterface.takeIntInput(1,2));
            }
        }
    }

}
