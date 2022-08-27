
import info.Customer;
import info.Employee;
import start.StartApplication;

public class Main {

    static Employee[] initialEmployee() {
        Employee[] employees = new Employee[30];

        employees[0] = new Employee(1, "SOUMIK", "1500");
        employees[1] = new Employee(2, "ASIF  ", "2100");
        employees[2] = new Employee(3, "NAVID ", "2300");
        employees[3] = new Employee(4, "MARUF ", "2200");

        return employees;
    }

    static Customer[] initialCustomers() {
        Customer[] customers = new Customer[30];

        customers[0] = new Customer(1, "MS.RABEYA   ", "MOHAMMADPUR", "01797325484");
        customers[1] = new Customer(2, "MD.HANIF    ", "BOGURA     ", "01745454838");
        customers[2] = new Customer(3, "RATUL MIA   ", "VOLA       ", "01789767876");
        customers[3] = new Customer(4, "SALMA KHATUN", "SIRAJGANJ  ", "01736687753");
        customers[4] = new Customer(5, "FATEMA BEGUM", "CHITTAGONG ", "01231589623");
        customers[5] = new Customer(6, "MR.RASHED   ", "FENI       ", "01325945314");
        customers[6] = new Customer(7, "SHEIKH JAMAL", "JHENAIDAH  ", "01985622434");
        customers[7] = new Customer(8, "ALIF BHUIYAN", "PABNA      ", "01833256359");
        customers[8] = new Customer(9, "RASHID KHAN ", "THAKURGAON ", "01358657531");

        return customers;
    }

    public static void main(String[] args) {
        StartApplication app = new StartApplication(initialCustomers(), initialEmployee());
        app.startApplication();
    }

}
