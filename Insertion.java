import java.util.*;
public class Insertion{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enetr the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n+1];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element u want to insert: ");
        int element = s.nextInt();
        System.out.println("Eneter the position where u want to insert: ");
        int position = s.nextInt();
        for(int i=n;i>=position;i--){
            arr[i] = arr[i-1];
        }
        arr[position-1] = element;
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}