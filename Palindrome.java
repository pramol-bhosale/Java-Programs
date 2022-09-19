import java.util.Scanner;
import java.lang.Math;
public class Palindrome{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number : ");
n=sc.nextInt();
n=Math.abs(n);
int rem=0,sum=0,m=n;
while(n != 0){
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
if(m==sum){
System.out.println("Given number is Palindrome");
}
else{
System.out.println("Given number is not Palindrome");
}

}



}
