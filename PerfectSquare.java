import java.util.Scanner;
import java.lang.Math;
public class   PerfectSquare {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int num=sc.nextInt();
double n=Math.sqrt(num);
int m1=(int)n;
int m2=(int)Math.ceil(n);
if(m1 == m2){
System.out.println(num+ " is perfect square ");
}
else{
System.out.println(num+" is not perfect square ");
}
}


}
