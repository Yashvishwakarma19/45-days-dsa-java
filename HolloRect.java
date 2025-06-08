import java.util.Scanner;
public class HolloRect{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int m = s.nextInt();
        int n = 4;
        int m = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}