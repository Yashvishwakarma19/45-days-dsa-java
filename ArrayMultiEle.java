import java.util.*;
public class ArrayMultiEle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr the number of elements: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        boolean found = false;
        String position = "";
        System.out.println("Enter the element to search: ");
        int search = s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i] == search){
                position += (i+1) +" ";
                found = true;} }
        if(found){
            System.out.println("Element found at loacation: "+ position);
        }else{
            System.out.println("Element Not found");
        }
    }
}
