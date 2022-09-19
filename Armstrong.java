import java.util.Scanner;
import java.lang.Math;
public class ArmStrong{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n<0){
System.out.println("Given Number is not Armstrong Number");
System.exit(0);
}
String s=String.valueOf(n);
int len=s.length();
int rem,m=n,sum=0;
while(n !=0 ){
rem=n%10;
sum+=Math.pow(rem,len);
n=n/10;
}
if(sum == m){
System.out.println("Given number is armstrong number");
}
else{
System.out.println("Given number is armstrong number");
}
}


}
