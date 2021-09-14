import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a whole number of cents:");
    int cents = scan.nextInt();
    int dollars = cents/100;
    int remainder = cents%100;
    int quarters = remainder/25;
    remainder = remainder%25;
    int dimes = remainder/10;
    remainder = remainder%10;
    int nickels = remainder/5;
    remainder = remainder%5;
    int pennies = remainder;
    System.out.println("number of dollars: " + dollars + ", " + "number of quarters: " + quarters + ", " + "number of dimes: " + dimes + ", " + "number of nickels: " + nickels + ", " + "number of pennies: " + pennies);
    }
}
