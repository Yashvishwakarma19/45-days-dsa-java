import java.util.*;
public class RotateDPlace{
    public static void main(String[] args) {
    Scanner s  = new Scanner(System.in);
    System.out.println("Enter the seize of array: ");
    int n = s.nextInt();
    System.out.println("Enter the elements in the array: ");
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = s.nextInt();
    }
    System.out.println("Enter D value: ");
    int d = s.nextInt();
    d = d % n;

    int a[] = new int[d];
    for(int i=0;i<d;i++){
        a[i] = arr[i];
    }
    for(int i=d;i<n;i++){
        arr[i-d] = arr[i];
    }
    for(int i=0;i<d;i++){
        arr[n-d + i] = a[i];
    }
    System.out.println("After rotating: ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }

}