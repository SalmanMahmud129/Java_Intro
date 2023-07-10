public class StudentProfile {
    

    String firstName;
    String lastName;
    int expectedGrad;
    double GPA;
    String declaredMajor;

    public StudentProfile(String firstName, String lastName, int expectedGrad, double GPA, String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGrad = expectedGrad;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public int delayGrad(){
        this.expectedGrad += 1;
        return this.expectedGrad;
    }
}
