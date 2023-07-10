public class CalculateTips {

    public static double calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;

        System.out.println("Your total is " + result);

        return result;
    }

    public static void main(String [] args){
        double totalForGroup = calculateTotalMealPrice(100, .18, .08);

        System.out.println(totalForGroup);

        double individualTotals = totalForGroup / 5;
        System.out.println("Each person owes " + individualTotals);
    }


}
