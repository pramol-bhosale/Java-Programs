import java.util.Scanner;
public class ReverseString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer sb=new StringBuffer(s);
sb.reverse();
System.out.println("Reverse of "+s+" is "+sb);


}

}
