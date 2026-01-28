import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for cap the array");
        int cap = input.nextInt();
        input.close();
        int [] numbers = new int[cap];
        
    }
    int findAverage(int[] numbers){
        int average = 0;
    for(int i = 0 ;i < numbers.length; i++ ){
        average += numbers[i];
    }
    return average;
    }
    int[] findDiffrence(int[] numbers, int average){
        int[] diff = new int[numbers.length];
        for(int i = 0 ;i < numbers.length; i++ ){
        diff[i] = diff[i] - average;
        }
        return diff;
    }

}
