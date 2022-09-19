//factorial using recursion method
import java.util.Scanner;
public class Factorial2{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
n=sc.nextInt();
int result=Fact(n);
System.out.println("Factorial Of "+n+" is "+result);
}
static int Fact(int m){
if(m==0){
return 1;
}
else{
return m*Fact(m-1);
}
}


}
