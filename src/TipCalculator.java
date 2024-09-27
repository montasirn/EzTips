import java.text.DecimalFormat;

public class TipCalculator {
    private double totalBill;
    private double tipPercentage;
    private int numberOfPeople;
    private DecimalFormat df;

    // Constructor
    public TipCalculator(double totalBill, double tipPercentage, int numberOfPeople) {
        this.totalBill = totalBill;
        this.tipPercentage = tipPercentage;
        this.numberOfPeople = numberOfPeople;
        this.df = new DecimalFormat("#.00");
    }

    // Calculate total tip amount
    public double calculateTotalTipAmount() {
        return (tipPercentage / 100) * totalBill;
    }

    // Calculate total bill cost
    public double calculateTotalBillCost() {
        return totalBill + calculateTotalTipAmount();
    }

    // Calculate tip per person
    public double calculateTipPerPerson() {
        return calculateTotalTipAmount() / numberOfPeople;
    }

    // Calculate total per person
    public double calculateTotalPerPerson() {
        return calculateTotalBillCost() / numberOfPeople;
    }

    public void printReceipt(){
        System.out.println("Total Tip Amount: $" + df.format(calculateTotalTipAmount()) );

        System.out.println("Total Bill Cost: $" + df.format(calculateTotalBillCost()));

        System.out.println("Tip Per Person: $" + df.format(calculateTipPerPerson()));

        System.out.println("Total Bill Per Person: $" + df.format(calculateTotalPerPerson()));
    }
}
