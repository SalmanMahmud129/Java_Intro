import java.util.Scanner;

public class MultipleChoiceQuestion {
    
    public static void main (String [] args){
        String question = "What day is it today?";
        String choice1 = "Monday";
        String choice2 = "Sunday";
        String choice3 = "Friday";

        String correctAnswer = choice2;


        System.out.println(question);
        System.out.println("1: Monday 2: Sunday 3: Friday");

        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        while(!answer.equalsIgnoreCase(correctAnswer)){
            System.out.println("Nope! Try again");

            answer = input.nextLine();

        }

        System.out.println("Correct");
    }
}
