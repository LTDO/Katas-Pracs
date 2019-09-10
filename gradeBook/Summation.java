package gradeBook;

import java.util.*;

public class Summation {

    public static void main(String args[]) {

        Summation summ = new Summation();
        int sum1 = 0;
        summ.summation(sum1);

    }

    public int summation(int sum2){
        int sum = 0;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers : " + sum);
        return sum2;
    }
}