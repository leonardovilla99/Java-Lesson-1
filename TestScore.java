import java.util.Scanner;

public class TestScore{
    public static void main(String[] args) {

        double S1,S2,S3,S4,S5;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter score 1: ");
            S1 = input.nextDouble();
            System.out.println("Enter score 2: ");
            S2 = input.nextDouble();
            System.out.println("Enter score 3: ");
            S3 = input.nextDouble();
            System.out.println("Enter score 4: ");
            S4 = input.nextDouble();
            System.out.println("Enter score 5: ");
            S5 = input.nextDouble();

            double avarage = calcAvarage(S1, S2, S3, S4, S5);
            
            System.out.println("The avarage is: " + avarage);
            System.out.println("The grade is: " + grade(avarage));
        }
    }

    // Method to calculate avarage
    public static double calcAvarage(double S1,double S2, double S3, double S4, double S5){
        return((S1+S2+S3+S4+S5)/5);
    }

    // Method to find grade
    public static String grade(double score){
        if(score >= 90){
            return "A";
        }else if(score>=80){
            return "B";
        }else if(score>=70){
            return "C";
        }else if(score>=60){
            return "D";
        }else {
            return "F";
        }
    }
}