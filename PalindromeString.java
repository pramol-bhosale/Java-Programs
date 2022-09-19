import java.util.Scanner;
public class PalindromeString{
public static void main(String args[]){
String s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String: ");
s=sc.nextLine();
StringBuffer sb=new StringBuffer(s);
sb.reverse();
String s1=String.valueOf(sb);
if(s.equals(s1)){
System.out.println(s+ " is palindrome String");
}
else{
System.out.println(s+" is not palindrome String");
}

}

}
