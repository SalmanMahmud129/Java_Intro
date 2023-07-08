import java.util.Scanner;

public class HelloWorld {
    public static void main(String [] args){
        System.out.println("Hello world! New class made from src directory");

        int studentAge = 15;
        double gpa = 3.45;
        boolean hasPerfectAttendance = true;
        String attendanceString = hasPerfectAttendance ? "has perfect attendance" : "does not have perfect attendance";
        String firstName = "Kayla";
        String lastName = "Harley";
        char studentFirstInitial = firstName.charAt(0);
        char studentLastInitial = lastName.charAt(0);
        String response = " ";
        

    

        System.out.println("age: " + studentAge + " is the age of student " + studentFirstInitial + studentLastInitial + ". He has a gpa of " + gpa + " and " + attendanceString  ) ;

        System.out.println("Update the gpa: ");
        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        System.out.println("gpa has been updated to: " + gpa);

        System.out.println("Does this student still have perfect attendance? ");
        Scanner res = new Scanner(System.in);
        response = res.next();
        if(response.equals("no")){
            
            hasPerfectAttendance = false;
            attendanceString = hasPerfectAttendance ? "has perfect attendance" : "does not have perfect attendance";
            System.out.println("Updated to " + attendanceString);

        }else{
            System.out.println("Good to hear");
        }
        
        
    }
}
