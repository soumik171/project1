package customer;

import Interface.NavigationInterface;
import Interface.TakeInputInterface;
import admin.Price;
import customer.AmountPrice;

public class WishList {

    public static final int SCREEN_ID = 12;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public WishList(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen() {
        System.out.println("\n\n");
        System.out.println("-------------------------------");
        System.out.println("|  ***Showcase (Wishlist)***  |");
        System.out.println("-------------------------------");

        System.out.println("\tStock-->");
        System.out.println("Toys: " + 250);
        System.out.println("Furnitures: " + 4050);
        System.out.println("Cloths: " + 500);

        Price.prices();
        AmountPrice AP = new AmountPrice(navigationInterface, takeInputInterface);
        AP.APrice();
        AP.AReceipt();

        System.out.println("1. Continue to payment");
        System.out.println("2. Back");
        System.out.println("3. Exit");

        navigationInterface.navigate(SCREEN_ID, takeInputInterface.takeIntInput(1, 3));
    }
}
