import java.util.*;
public class SecondLargest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enetr array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int Largest = arr[0];
        int Slargest = -1;
        for(int i=0;i<n;i++){               //O(N)
            if(arr[i] > Largest){
                Largest = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if((arr[i] > Slargest) && (arr[i] != Largest)){     //O(N)
                Slargest = arr[i];
            }
        }
        System.out.println("Second Largest Element is: "+Slargest);     //O(2N)
    }
}