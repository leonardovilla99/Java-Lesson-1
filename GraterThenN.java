public class GraterThenN {
    public static void main(String[] args) {
        int n = 3;
        int[] array = {1,5,10,2,4,-3,6};
        biggerThen(array, n);
        n = 12;
        int[] array2 = {10,12,15,24};
        biggerThen(array2, n);
    }

    public static void biggerThen(int[] array,int n){
        for(int i=1; i <array.length; i++){
            if(array[i] > n){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }
}
