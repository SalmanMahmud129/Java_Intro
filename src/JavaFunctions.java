import java.util.Scanner;

public class JavaFunctions {
    

    public static void announceTeaTime(){
        System.out.println("Waiting for tea time... ");
        System.out.println("Enter a random word and press enter");
        
        Scanner input = new Scanner(System.in);

        input.next();

        System.out.println("Its tea time");
    }


    public static void main(String [] args){
        System.out.println("Welcome to your new job");
        announceTeaTime();

        System.out.println("Write code");
        System.out.println("Review Code ");
        System.out.println("LEarn stuff");

        announceTeaTime();

        System.out.println("Get Promoted");

    }


}
