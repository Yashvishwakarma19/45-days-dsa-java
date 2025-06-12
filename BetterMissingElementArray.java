import java.util.Scanner;

public class BetterMissingElementArray{
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int n= arr.length;              //time: O(n) + O(n);
                                        // space: O(n)
        int hash[] = new int[n+2];
        for(int i=0;i<n;i++){
            hash[arr[i]] = 1;
        }
        for(int i=1;i<n+1;i++){
            if(hash[i] == 0){
                System.out.println("Missing Number Using hashing is: "+i);
                return;
            }
        }
        System.out.println("No missing number ");

    }
}