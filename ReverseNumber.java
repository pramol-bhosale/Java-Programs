import java.util.Scanner;
public class ReverseNumber{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number : ");
n=sc.nextInt();
String s=String.valueOf(n);
StringBuffer sb=new StringBuffer(s);
sb.reverse();
s=String.valueOf(sb);
System.out.println("Reverse of "+n+ "is "+s);
}

}
