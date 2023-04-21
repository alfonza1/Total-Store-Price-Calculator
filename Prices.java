package Scanner;
import java.util.Scanner;
public class Prices {


    public static void main(String[] args) throws InterruptedException {


        double miles;
        double price;
        int quantity;
        double total;
        String product;
        double milesAdded = 0;
        String store;

        Scanner askForProduct = new Scanner(System.in);

        System.out.println("What store did you go to?");
        store = askForProduct.nextLine();

       System.out.println("Whats did you buy?");
       product = askForProduct.nextLine();

        System.out.println("How many did you buy?");
        quantity = askForProduct.nextInt();

        System.out.println("what was the price?");
        price = askForProduct.nextDouble();

        System.out.println("How far away in miles was it?");
        miles = askForProduct.nextDouble();


        if(miles < 5){
            milesAdded = 2;
        } else if ( miles <= 15) {
           milesAdded = 5;
        }
        else if ( miles <= 25) {
            milesAdded = 10;
        }
        else if ( miles <= 50) {
            milesAdded = 10;
        }
        else {
            milesAdded = 20;
        }


        total = quantity * price + milesAdded;
        System.out.format("Calculating");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(400);
        System.out.print(".");
        Thread.sleep(400);
        System.out.print(".");
        Thread.sleep(400);
        System.out.println();
        System.out.println();
        System.out.println("Heres your total from " + store);
        System.out.format("%s   %4s   %7s   %8s   %-8s %n", "Product", "Qty", "Price", "Miles", "Total");


        System.out.format("%-10s %-7s %-9s %-10s %s %n","----","---","-----"," ----", "-----");


        String output = String.format("%s %7d %9.2f %10.2f %8.2f %n", product, quantity, price, miles, total);
        System.out.println(output);


        System.out.format("%5s %9s" ," ","Thank you come again");


    }




}
