//2. Program to Check Even or Odd
import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num % 2 == 0){
            System.out.println("This is even number");
        }else{
            System.out.println("This is odd Number");
        }
    }
}