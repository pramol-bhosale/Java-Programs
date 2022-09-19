import java.util.Scanner;
public class SmallestAmongThree{
public static void main(String args[]){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number: ");
a=sc.nextInt();
System.out.println("Enter second number:");
b=sc.nextInt();
System.out.println("Enter third number:");
c=sc.nextInt();
if(a<b){
	if(a<c){
	System.out.println("Smallest number is "+a);
	}
	else{
	System.out.println("Smallest number is "+c);
	}
}
else {
   if(b<c){
   System.out.println("Smallest number is "+b);
   }
   else{
   System.out.println("Smallest number is "+c);
   }

}

}


}
