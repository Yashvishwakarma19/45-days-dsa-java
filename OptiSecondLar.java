import java.util.*;
public class OptiSecondLar{
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
        for(int i=0;i<n;i++){
            if(arr[i] > Largest){
                Slargest = Largest;             //O(N)
                Largest = arr[i];
            }else if((arr[i] < Largest) && (arr[i] > Slargest)){
                Slargest = arr[i];
            }
        }
        System.out.println("Second Largest Element is: "+Slargest);
    }
}