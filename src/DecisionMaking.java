import java.util.Scanner;

public class DecisionMaking {
    
    public static void main(String [] args){
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int enteredNum = input.nextInt();

        if(enteredNum < 5 ){
            System.out.println("good luck");
        }else{
            System.out.println("Bad luck");
        }
    }
}
