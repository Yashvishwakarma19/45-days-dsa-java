import java.util.*;
public class PrefixSum{
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
        int pref[] = new int[n];
        pref[0] = arr[0];
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(pref[i]+" ");
        }

    }
}