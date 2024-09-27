
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //User input for total, tip percent and number of people

            System.out.println("Welcome to EzTip, enter the amounts as required without symbols!");

            System.out.print("Enter your total ($): ");
            double total = s.nextDouble();

            System.out.print("What percent you want to tip: ");
            double tip = s.nextDouble();

            System.out.print("How many people are splitting: ");
            int numPeople = s.nextInt();


        //performing calculations
            TipCalculator calculator = new TipCalculator(total, tip, numPeople);

        //Printing result

            System.out.println();

            calculator.printReceipt();

        //close scanner

        s.close();

    }
}