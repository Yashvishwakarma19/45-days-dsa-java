//4. Simple Calculator using Switch Case
import java.util.Scanner;
public class calci{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        char ch = s.next().charAt(0);

        switch(ch){
            case '+' : System.out.println(a+b); break;
            case '-' : System.out.println(a-b); break;
            case '*' : System.out.println(a*b); break;
            case '/' :
                if(b != 0){
                    System.out.println(a/b);
                }else{
                    System.out.println("Division by zero not possible");
                }
        }
    }
}