import java.util.Scanner;

public class Looping {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isOnRepeat = true;

        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Stay on repeat?");

            String input = scanner.next();

            if(input.equals("no")){
                isOnRepeat = false;
            }
        }
        

        System.out.println("Playing next song");
    }
}
