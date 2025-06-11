import java.util.Scanner;
public class BinarySearch{
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enetr array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the value u wan to search: ");
        int x = s.nextInt();
        boolean flag= false;
        int first = 0;
        int last = n-1;
        while(first <= last){
            int mid = first + (last - first)/2;
            if(x == arr[mid]){
                flag = true;
                break;
            }else{
                if(x > arr[mid]){
                    first = mid + 1;
                }else{
                    last = mid - 1;
                }
            }
        }
        if(flag == true) System.out.println("Element is found");
        else System.out.println("Element is not found!!");
    }
}