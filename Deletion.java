import java.util.*;
public class Deletion{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enetr the size of the array: ");
        int inp = s.nextInt();
        System.out.println("Eneter the array Elements: ");
        int arr[] = new int[inp];
        for(int i=0;i<inp;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the position to be deleted: ");
        int pos = s.nextInt();
        for(int i=pos-1;i<inp-1;i++){
            arr[i] = arr[i+1];
        }
        for(int i=0;i<inp-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}