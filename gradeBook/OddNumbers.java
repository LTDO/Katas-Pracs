package gradeBook;

public class OddNumbers{
    public static int array[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    public static int rowSumOddNumbers(int n) {
        int index1 = 0;
        for (int i = 1; i < n; i++) {
            index1 += i;
        }
        int tot = 0;
        for (int k = index1; k < index1 + n; k++) {
            tot += array[k];
        }
        return tot;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1)); 
        System.out.println(rowSumOddNumbers(2)); 
        System.out.println(rowSumOddNumbers(3)); 
    }
}