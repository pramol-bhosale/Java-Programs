import java.util.Scanner;
public class Ascii{
	public static void main(String args[]){
char c;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
c=s.charAt(0);
int val=c;
System.out.println("ASCII value of "+c+" is "+val);

}
}
