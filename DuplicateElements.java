import java.util.*;
public class DuplicateElements{
    public static void main(String[] args) {
        //array Should be shorted
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enetr array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int i = 0;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}