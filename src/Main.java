public class Main {
    public static void main (String [] args){
        Triangle t1 = new Triangle(15, 8, 15, 8, 17);
        Triangle t2 = new Triangle(3,2.598 , 3, 3, 3);


        // needs to be called on an instance. In this case the instance is t1. Instance methods are also called non-static methods
        // class methods or static methods such as Math.pow do not need an instance to use them. You can just use Math.pow(2,3 ) in your function
        // charAt() is an instance method. Need to call it on a string
        double t1Area = t1.findArea();

        System.out.println(t1Area);
        System.out.println(t1.sideLenThree); //instance variable

        double t2Area = t2.findArea();
        
        System.out.println(t2Area);
        System.out.println(t2.base); //instance variable

        System.out.println(Triangle.numOfSides);




        StudentProfile s1 = new StudentProfile("Sal", "Mahmud", 2023, 3.4, "TSM");
        StudentProfile s2 = new StudentProfile("Salman", "Mah", 2023, 3.1, "ME");

        s1.delayGrad();
        System.out.println("Sal's now expected to graduate in " + s1.expectedGrad);



    }
}
