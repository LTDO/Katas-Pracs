package gradeBook;
import java.util.*;

public class SumOfArrays {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    int[] array2 = {12,25,32,85,69,95,47,58,96,100};
    
    int sum2 = 0;
    for(int num1 : array2){
        sum2 = sum2 + num1;
    }
    System.out.println("Sum of default array is: " + sum2);

    int sum = 0;
    System.out.println("Enter 10 elements:");
    for (int i = 0; i < 10; i++) {
      array[i] = scanner.nextInt();
    }
    for (int num : array) {
      sum = sum + num;
    }
    int totalSum = sum + sum2;
    System.out.println("Sum of array elements is:" + sum);
    System.out.println("Total sum of default array and user array is: " + totalSum);
  }
}