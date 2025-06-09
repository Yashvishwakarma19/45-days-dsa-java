import java.util.*;
public class SumAllEle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enetr array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Sum of all the elements is: "+sum);
        int avg = sum/arr.length;
        System.out.println("Average of all the elements is: "+avg);
    }
}