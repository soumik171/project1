package admin;

import Interface.NavigationInterface;
import Interface.TakeInputInterface;

public class Price extends StoreHouse {

    public static int bp = 5;
    public static int cop = 15;
    public static int clp = 2;

    public Price(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        super(navigationInterface, takeInputInterface);
    }

    public static void prices() {
        System.out.println("\n\tPrices-->");
        System.out.println("\nPrice of per " + toy + " :" + bp + "$");
        System.out.println("Price of per " + furni + " :" + cop + "$");
        System.out.println("Price of per " + cl + " :" + clp + "$");
    }

}
