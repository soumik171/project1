package customer;

import Interface.NavigationInterface;
import Interface.TakeInputInterface;
import customer.Review;

public class PaymentScreen {

    Review rev = new Review();

    public static final int SCREEN_ID = 13;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public PaymentScreen(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen() {
        System.out.println("\n\n");
        System.out.println("-------------------------------");
        System.out.println("|           Payment           |");
        System.out.println("-------------------------------");

        System.out.println("Choose a payment option: ");
        System.out.println("1. Online Payment");
        System.out.println("2. Cash on delivery");
        System.out.println("3. Back");
        System.out.println("4. Exit");

        int input = takeInputInterface.takeIntInput(1, 4);
        switch (input) {
            case 1:
                System.out.print("Enter Card/Bkash/Rocket number: ");
                takeInputInterface.takeStringInput();
                System.out.print("Enter Pin: ");
                takeInputInterface.takeStringInput();
                System.out.println("Verifying.....");
                System.out.println("Payment Successful!");

                System.out.println("Your purchase is on the way. You will get your order in 7 days.");
                System.out.println("Thank you.");

                System.out.println("\nBrought to you By:");
                rev.WriteInFile();
                rev.ReadFromFile();

                System.exit(0);
            case 2:
                System.out.println("Your purchase is on the way. You will get your order in 7 days.");
                System.out.println("Thank you.");

                System.out.println("\nBrought to you By:");
                rev.ReadFromFile();

                System.exit(0);
            case 3:
                System.out.println("\nBrought to you By:");
                rev.WriteInFile();
                rev.ReadFromFile();

                //System.exit(0);
                navigationInterface.navigate(SCREEN_ID, 0);
            case 4:
                System.out.println("\nBrought to you By:");
                rev.WriteInFile();
                rev.ReadFromFile();

                System.exit(0);
        }
    }
}
