import java.util.Scanner;
public class  NaturalNumberSum {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the final Number:");
int num=sc.nextInt();
int result=(num*(num+1))/2;
System.out.println("Sum of natural numbers till "+num+" is "+result);
}


}
