import java.util.*;
public class righttring{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int m = s.nextInt();
       
       for(int i=0;i<n;i++){
        for(int j=i-1;j<m;j++){
            System.out.println("*  ");
        }
        System.out.println();
       }
    }
}