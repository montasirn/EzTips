import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Setting up decimal format for currency, decimals is 2 decimal places

            DecimalFormat df1 = new DecimalFormat("#.00");

        //User input for total, tip percent and number of people

            System.out.println("Welcome to EzTip, enter the amounts as required without symbols!");

            System.out.print("Enter your total ($): ");
            String totalString = s.nextLine();

            System.out.print("What percent you want to tip: ");
            String tipString = s.nextLine();

            System.out.print("How many people are splitting: ");
            String numPeopleString = s.nextLine();

        //converting variables from strings to most reasonable classes

            double total = Double.parseDouble(totalString);

            double tip = Double.parseDouble(tipString);

            int numPeople = Integer.parseInt(numPeopleString);

        //performing calculations

            double totalTipAmount = (tip / 100) * total;

            double totalBillCost = totalTipAmount + total;

            double tipPerPerson = totalTipAmount / numPeople;

            double totalPerPerson = totalBillCost / numPeople;

        //Printing result

            System.out.println();

            System.out.println("Total Tip Amount: $" + df1.format(totalTipAmount) );

            System.out.println("Total Bill Cost: $" + df1.format(totalBillCost));

            System.out.println("Tip Per Person: $" + df1.format(tipPerPerson));

            System.out.println("Total Bill Per Person: $" + df1.format(totalPerPerson));

        //close scanner

        s.close();

    }
}