import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for cap the array");
        int cap = input.nextInt();
        input.close();
        int [] numbers = new int[cap];
        
        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = (int) (Math.random()*100) + 1;
        }
    }
    }
