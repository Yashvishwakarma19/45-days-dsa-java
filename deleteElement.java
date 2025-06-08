import java.util.*;
public class deleteElement{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enetr the size of the array: ");
        int n = s.nextInt();
        System.out.println("Eneter the array Elements: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Eneter the element u want to delete: ");
        int del = s.nextInt();
        boolean found = false;
        int i;
        for(i=0;i<n;i++){
            if(arr[i] == del){
                found = true;
                break; }}
        if(found){
            for(int j=i; j<n-1 ;j++){
                arr[j] = arr[j+1];
            }
            for(int j=0;j<n-1;j++){
                System.out.print(arr[j]+" ");
            }
        }else{
            System.out.println("Element not found!!");
        }
    }
}