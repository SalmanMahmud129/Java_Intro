import java.util.Scanner;

public class SalaryCalculator {
    

    public static double moneyPerWeek(double hours, double hourlyRate){
        double weeklyIncome = hours * hourlyRate;

        return weeklyIncome;
    }

    public static double grossSalary(double weeklyIncome){

        double salary = weeklyIncome * 52;

        return salary;
    }

    public static double includeVacationDays(double hours, double daysOff, double hourlyRate){
        // double hoursInYear = hours * 52;

        double hoursOff = daysOff * 8 * hourlyRate;
        

        return hoursOff;
    }
    
    
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("How many hours do you work?");
        double hours = input.nextDouble();

        System.out.println("What is your hourly rate?");
        double hourlyRate = input.nextDouble();

        System.out.println("How many vacation days did you use?");
        int daysOff = input.nextInt();

        double weeklyIncome = moneyPerWeek(hours, hourlyRate);

        double hoursWithVacation = includeVacationDays(hours, daysOff, hourlyRate);

        double result = grossSalary(weeklyIncome) - hoursWithVacation;


        System.out.println("Your salary is " + result);

        input.close();
        

    } 
}
