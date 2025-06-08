import java.util.*;
public class RotateArr1{
    public static void main(String[] args) {
    Scanner s  = new Scanner(System.in);
    System.out.println("Enter the seize of array: ");
    int n = s.nextInt();
    System.out.println("Enter the elements in the array: ");
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = s.nextInt();
    }
    int temp = arr[0];
    for(int i=1;i<n;i++){
        arr[i-1] = arr[i] ;
    }
    arr[n-1] = temp;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}