import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for cap the array");
        int cap = input.nextInt();
        int [] numbers = new int[cap];
        boolean check = false;
        System.out.print("Enter your choice 1-4. 5 for the exit.");
        int choice = in.nextInt;
        while(!check){
            if(choice = 1){
                findMin(numbers);
            }
            else if(choice = 2){
                findMax(numbers);
            }
            else if(choice = 3){
                findAverageAndDifference(numbers);
            }
            else if(choice = 4){
                findSum(numbers);
            }
            else if(choice = 5){
                check = true;
            }
        }
    }
       public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
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
    }
