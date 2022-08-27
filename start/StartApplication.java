package start;
import Interface.NavigationInterface;
import Interface.TakeInputInterface;
import admin.*;
import customer.*;
import info.Customer;
import info.Employee;


import java.util.Scanner;

public class StartApplication implements NavigationInterface, TakeInputInterface { //Interface Navigation interface implemented here
    static Scanner scanner = new Scanner(System.in);


    public static final int TOTAL_TOYS = 250;
    public  static final int TOTAL_FURNITURES = 450;
    public  static final int TOTAL_CLOTHS = 500;

    Customer[] customers;
    Employee[] employees;

    public StartApplication(Customer[] customers, Employee[] employees) {
        this.customers = customers;
        this.employees = employees;
    }

    private  StartScreen startScreen = new StartScreen(this, this);
    private  AdminLogin adminLogin = new AdminLogin(this, this);
    private  CustomerLogin customerLogin = new CustomerLogin(this, this);
    private  StoreHouse storeHouse = new StoreHouse(this, this);
    private  AdminEmployeeInfo adminEmployeeInfo = new AdminEmployeeInfo(this, this);
    private  AdminCustomerInfo adminCustomerInfo = new AdminCustomerInfo(this, this);
    private  AddNewEmployee addNewEmployee = new AddNewEmployee(this, this);
    private  AdminAccess adminAccess = new AdminAccess(this, this);
    private  RemoveEmployee removeEmployee = new RemoveEmployee(this, this);
    private  AddNewCustomer addNewCustomer = new AddNewCustomer(this, this);
    private  RemoveCustomerScreen removeCustomerScreen = new RemoveCustomerScreen(this, this);
    private  WishList wishList = new WishList(this, this);
    private  PaymentScreen paymentScreen = new PaymentScreen(this, this);

    public void startApplication(){
        startScreen.displayScreen();
    }

    public int takeIntInput(int minValue, int maxValue){
        while(true){
            String inp = scanner.nextLine();
            try{
                int input = Integer.parseInt(inp);
                if (input >= minValue && input <= maxValue) return input;
            }catch (Exception ignored){ }
            System.out.println("Invalid Input. Please try again!");
        }
    }

    @Override
    public String takeStringInput() {
        return scanner.nextLine();
    }



    @Override //Polymorphism
    public void navigate(int from, int to) {
        switch (from){
            case 1:
                switch (to){
                    case 1:
                        adminLogin.displayScreen();
                    case 2:
                        customerLogin.displayScreen(customers);
                    case 3:
                        System.exit(0);
                }

            case 2:
                switch (to){
                    case 0:
                        adminAccess.displayScreen();
                    case 1:
                        adminLogin.displayScreen();
                    case 2:
                        startScreen.displayScreen();
                }

            case 3:
                switch (to){
                    case 1:
                        adminEmployeeInfo.displayScreen(employees);
                    case 2:
                        adminCustomerInfo.displayScreen(customers);
                    case 3:
                        storeHouse.displaScreen();
                    case 4:
                        startScreen.displayScreen();
                    case 5:
                        System.exit(0);
                }

            case 4:
                switch (to){
                    case 1:
                        addNewEmployee.displayScreen(employees);
                    case 2:
                        removeEmployee.displayScreen(employees);
                    case 3:
                        adminAccess.displayScreen();
                    case 4:
                        System.exit(0);
                }

            case 5:
                adminEmployeeInfo.displayScreen(employees);
            case 6:
                //adminLogin.displayScreen();
                adminEmployeeInfo.displayScreen(employees);

            case 7:
                switch (to){
                    case 1:
                        addNewCustomer.displayScreen(customers);
                    case 2:
                        removeCustomerScreen.displayScreen(customers);
                    case 3:
                        adminAccess.displayScreen();
                    case 4:
                        System.exit(0);
                }

            case 8:
            case 9:
                adminCustomerInfo.displayScreen(customers);

            case 10:
                switch (to){
                    case 1:
                        adminAccess.displayScreen();
                    case 2:
                        System.exit(0);
                }

            case 11:
                switch (to){
                    case 0:
                        startScreen.displayScreen();
                    case 1:
                        wishList.displayScreen();
                    case 2:
                        startScreen.displayScreen();
                    case 3:
                        System.exit(0);
                }

            case 12:
                switch (to){
                    case 1:
                        paymentScreen.displayScreen();
                    case 2:
                        customerLogin.displayScreen(customers);
                    case 3:
                        System.exit(0);
                }

            case 13:
                wishList.displayScreen();
        }
    }
}
