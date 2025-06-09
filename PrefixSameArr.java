import java.util.*;
public class PrefixSameArr{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enetr array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}