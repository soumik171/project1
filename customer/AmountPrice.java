package customer;
import Interface.*;

import java.math.BigInteger;

import static admin.Price.*;

public class AmountPrice {

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;
    double billtoy;
    double billfurniture;
    double billcloth;

    int outtotaltoys;
    int outtotalfurniture;
    int outtotalcloth;

    double totalbill;
    AmountPrice(){
        
    }
    AmountPrice(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }
    public void APrice() {

        System.out.print("\nEnter number of Toys to purchase: ");
        int totalToys = takeInputInterface.takeIntInput(0, 2500);
        System.out.print("Enter number of Furnitures to purchase: ");
        int totalFurniture = takeInputInterface.takeIntInput(0, 4500);
        System.out.print("Enter number of Cloths to purchase: ");
        int cloths = takeInputInterface.takeIntInput(0, 5000);
        billtoy = totalToys * bp;
        billfurniture = totalFurniture * cop;
        billcloth = cloths * clp;
        this.outtotaltoys=totalToys;
        this.outtotalfurniture=totalFurniture;
        this.outtotalcloth=cloths;
        this.totalbill=(billtoy+billfurniture+billcloth);
    }

    public void AReceipt(){

        System.out.println("\n\t<<<<<<<<<<<Receipt>>>>>>>>>>>>>");
        System.out.println("\n"+toy+" amount "+outtotaltoys+" bill ::"+billtoy+"$");
        System.out.println(furni+" amount "+outtotalfurniture+" bill ::"+billfurniture+"$");
        System.out.println(cl+" amount "+outtotalcloth+" bill ::"+billcloth+"$");

        System.out.println("Total Bill:: "+totalbill+"$");


    }
}