import java.util.*;
public class PrefLtoR{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        //1 based Indexing
        int arr[] = new int[n+1];
        System.out.println("Enetr array elements: ");
        for(int i=1;i<=n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int pref[] = new int[n+1];
        pref[0] = 0;
        for(int i=1;i<=n;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        System.out.println("Enter l and r value: ");
        int l = s.nextInt();
        int r = s.nextInt();
        
        int sum = pref[r] - pref[l-1];
        System.out.println("Sum from "+l+" to "+" r is: "+sum);

    }
}