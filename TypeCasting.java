//5. Typecasting in Java
import java.util.Scanner;
public class TypeCasting{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Integer Value: ");
        int a = s.nextInt();

        System.out.print("Eneter Double Value: ");
        double b = s.nextDouble();

        System.out.println("Entered integer value is: "+a);
        System.out.println("Entered double value is: "+b);

        double c = a;
        System.out.println("TypeCasted integer value to double is: "+c);

        int d = (int)b;
        System.out.println("TypeCasted double value to integer is: "+d);
    }
}