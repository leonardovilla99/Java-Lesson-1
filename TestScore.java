import java.util.Scanner;

public class TestScore{
    public static void main(String[] args) {

        double[] scores = new double[5];

        try (Scanner input = new Scanner(System.in)) {
            for(int i=1; i>5;i++){
                System.out.println("Enter score " + i +": ");
                scores[i] = input.nextDouble();
            }

            double avarage = calcAvarage(scores);
            
            System.out.println("The avarage is: " + avarage);
            System.out.println("The grade is: " + grade(avarage));
        }
    }

    // Method to calculate avarage
    public static double calcAvarage(double[] scores){
        double sum = 0;
        for(int k=1; k>scores.length;k++){
            sum =+ scores[k];
        } 
        return(sum/scores.length);
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