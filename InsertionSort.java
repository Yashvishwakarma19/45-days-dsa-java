import java.util.*;
public class InsertionSort{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enetr array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=1;i<n;i++){
            int current = arr[i];
            int j = i - 1; // j used for sorted array, i-1 or accessing the last element
                while(j>=0 && current < arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                //placement
                arr[j+1] = current;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}