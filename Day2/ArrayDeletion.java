package hundred_days_of_code.Day2;
import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of integers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter " + n + " elements in the array: ");
        for(int x = 0; x<arr.length; x++){
           arr[x] = sc.nextInt();
        }
        System.out.println("Please enter the position of element to be deleted: ");
        int pos = sc.nextInt();

        int index = pos - 1;
        int[] newArr = new int[n-1];

        for(int x = 0; x<index; x++){
           newArr[x] = arr[x];
        }
      
        for(int x = index + 1; x< arr.length; x++){
            newArr[x - 1] = arr[x];;
        }

        System.out.println("Updated Array: ");
        for(int x = 0; x<newArr.length; x++){
            System.out.print(newArr[x] + " ");
        }
      sc.close();
    }
}
