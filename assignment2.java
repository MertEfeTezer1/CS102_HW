import java.util.Scanner;
import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for cap the array: ");
        int cap = input.nextInt();
        int [] numbers = new int[cap];
        
        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = (int) (Math.random()*100) + 1;
        }
        boolean check = false;
        while(!check){
            System.out.println("1-Finding min value of an array.");
            System.out.println("2-Finding max value of an array.");
            System.out.println("3-Finding average and then the difference of an array.");
            System.out.println("4-Finding sum of odd and even index of an array.");
            System.out.println("5-Exit.");
            System.out.print("Enter your choice 1-5: ");
            int choice = input.nextInt();
            if(choice == 1){
                findMin(numbers);
            }
            else if(choice == 2){
                findMax(numbers);
            }
            else if(choice == 3){
                findAverageAndDifference(numbers);
            }
            else if(choice == 4){
                findSum(numbers);
            }
            else if(choice == 5){
                check = true;
            }
        }
    }
    public static void findAverageAndDifference(int[]numbers){
        int sum = 0;
        for (int number : numbers){
            sum = sum + number;
        }
        double average = (double) (sum / numbers.length);
        double[] differenceNumbers = new double[numbers.length];
        for(int i = 0;i<numbers.length;i++){
            differenceNumbers[i] = numbers[i] - average;
        }
        System.out.println(Arrays.toString(differenceNumbers));
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void findSum(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Odd sum: " + oddSum + " Even sum: " + evenSum);
    }
}
