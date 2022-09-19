import java.util.Scanner;
public class Fibonacci2 {
    //program to find nth term in the fibonacci series
    public static void main(String args[]){
        int a=0,b=1,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Which term you Want ?");
        int n=sc.nextInt();
        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
            System.out.println(b);
        }
        else {
            int i;
            for(i=3;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }
}
