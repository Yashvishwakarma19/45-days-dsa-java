public class FactorialFun{
    public static void fact(int n){
        int f=1;
        if(n<0){
            System.out.println("Invalid Statement");
            return;
        }
        for(int i=1;i<=n;i++){
            f *= i;
        }
        System.out.println(f);
    }
    public static void main(String[] args) {
        int num=5;
        fact(num);
    }
}