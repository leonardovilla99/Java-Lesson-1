import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {
        double[] rf = new double[12];
        String[] monthNames = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DIC"};

        enterRainfall(rf, monthNames);
        System.out.println("Total rainfall of the year was: " + totalRainfall(rf));
        System.out.println("Avarage rainfall of the year was: " + avarageRainfall(rf));
        System.out.println("Highest rainfall was in " + maxRainfallMonth(rf,monthNames));
        System.out.println("Smallest rainfall was in " + minRainfallMonth(rf, monthNames));
    }

    public static void enterRainfall(double[] rf,String[] monthNames) {
        try (Scanner input = new Scanner(System.in)) {
            for(int i=0; i<rf.length; i++){
                System.out.print("Enter rainfall for " + monthNames[i] + ": ");
                rf[i] = input.nextDouble();
                while(rf[i] < 0){
                    System.out.println("Negative value are not allowed");
                    System.out.print("Enter rainfall for " + monthNames[i] + ": ");
                    rf[i] = input.nextDouble();
                }
            }
        }
    }

    public static double totalRainfall(double[] rf){
        double sum = 0;
        for(int i=0; i<rf.length; i++){
            sum =+ rf[i];
        }
        return sum;
    }

    public static double avarageRainfall(double[] rf){
        return totalRainfall(rf)/rf.length;
    }

    public static String maxRainfallMonth(double[] rf, String[] monthNames){
        int indexOfHighest = 0;
        for(int i=1; i<rf.length; i++){
            if(rf[i]>rf[indexOfHighest]){
                indexOfHighest = i;
            }
        }
        return monthNames[indexOfHighest];
    }

    public static String minRainfallMonth(double[] rf, String[] monthNames){
        int indexOfSmallest = 0;
        for(int i=1; i<rf.length; i++){
            if(rf[i]<rf[indexOfSmallest]){
                indexOfSmallest = i;
            }
        }
        return monthNames[indexOfSmallest];
    }

}
