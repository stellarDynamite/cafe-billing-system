import java.util.Scanner;

public class Order {
    Scanner scan = new Scanner(System.in);
    byte choice;
    int totalBill = 0;

    void viewMenu() {
        while (true) {
            System.out.println("__Menu__\n1. Cake\n2. Coffee\n");
            System.out.println("Enter your choice(1/2): ");

            choice = scan.nextByte();
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid format. Please Reorder! ");
                return;
            }

            if (choice == 1) {
                Cake cake = new Cake();
                cake.buildCake();
                totalBill += cake.getPrice();

            }
            if (choice == 2) {
                Coffee coffee = new Coffee();
                coffee.buildCoffee();
                totalBill += coffee.getPrice();
            }
            System.out.println("The price so far: " + totalBill);
            System.out.println("Do you want to add more?( (Y/N) ");
            String ch = scan.next();
            String yes = "Yy";
            if (!(yes.contains(ch)))
                break;
            
        }
        System.out.println("Total bill is: Rs." + totalBill);
    }
    
}