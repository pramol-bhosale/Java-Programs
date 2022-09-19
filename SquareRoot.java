import java.util.Scanner;
public class SquareRoot{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number :");
int n=sc.nextInt();
boolean flag=false;
for(int i=1;i<= (n/2)+1;i++){
if(n/i==i && n%i==0){
System.out.println("Square Root is "+i);
flag=true;
break;
}

}
if(!flag){
System.out.println(n+" is not perfect square");
}

}

}
