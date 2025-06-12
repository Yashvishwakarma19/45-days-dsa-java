import java.util.Scanner;

public class MissingElementArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enetr array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        boolean flag;
        int i;
        for(i=1;i<=n;i++){
            flag=false;
            for(int j =0;j<n;j++){
                if(arr[j] == i){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Missing Number is: "+i);
                return;
            }
        }
        System.out.println("No missing no.");
    }
}