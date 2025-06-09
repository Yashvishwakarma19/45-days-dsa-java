import java.util.*;
public class TwoSumEle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enetr array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the Sum u want: ");
        int target = s.nextInt();

        boolean present = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){ //j=0;
                // if(i==j) continue;
                if((arr[i] + arr[j]) == target){
                    present = true;
                    break;
                }
            }
        }
        if(present){
            System.out.println("Sum of 2 Elements are Present!!");
        }else{
            System.out.println("Sum of 2 Elements are Not Present");
        }
    }
}