import java.util.*;
public class Rectangle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

}