import java.util.Scanner;
public class InvertPyra{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print(" "+j+"");
            }
            System.out.println();
        }
    }
}