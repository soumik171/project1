package admin;

import info.Employee;
import Interface.*;

public class RemoveEmployee {

    public static final int SCREEN_ID = 6;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public RemoveEmployee(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(Employee[] emps) {
        System.out.println("\n\n");
        System.out.print("Enter Employee ID: ");
        int id = takeInputInterface.takeIntInput(1, Integer.MAX_VALUE);

        for (int i = 0; i < emps.length; i++) {
            if (emps[i] != null) {
                if (emps[i].getId() == id) {
                    emps[i] = null;
                    System.out.println("Employee has Removed");
                    break;
                }
            }
        }
        System.out.println("Saved Successful!");
        navigationInterface.navigate(SCREEN_ID, 0);
    }
}
