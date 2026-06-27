//Insert an Element in an array

//https://100-days-of-dsa.vercel.app/

package hundred_days_of_code.Day1;
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of array n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter " + n + " elements: ");
        for(int x = 0; x < n; x++){
            arr[x] = sc.nextInt();
        }
        System.out.println("Please enter the index of tobeInserted element: ");
        int index = sc.nextInt();

        System.out.println("Please enter the element to be inserted: ");
        int newElement = sc.nextInt();
        System.out.println("\n");

        int[] newArr = new int[n+1];
        
       for (int x = 0; x < index; x++) {
            newArr[x] = arr[x];
        }

        newArr[index] = newElement;


        for (int x = index; x < n; x++) {
           newArr[x + 1] = arr[x];
    }

       System.out.println("\nArray after insertion:");
       for (int x = 0; x < newArr.length; x++) {
         System.out.print(newArr[x] + " ");
       }
        sc.close();
        
    }

}
