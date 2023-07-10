public class Triangle {

    // static variables/class variable, variables used with the dot operator on classes themselves
    static int numOfSides = 3;

    // instance variables/attributes, need to have constructed an instance to use the dot operator on these 
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // constructor. Can be used to initialize default values
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        // the this portion is the value you enter when calling an instance of the class
        // for example Triangle t1 = new Triangle(x,y,z ....) whats in the parenthesis are the this values that will be assigned to the attributes of the class
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;

    }

    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
