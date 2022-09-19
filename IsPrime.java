import java.util.Scanner;
public class IsPrime{
public static void main(String args[]){
	int ctr=0,n=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
n=sc.nextInt();
for(int i=1;i<=(n/2);i++){
if(n%i == 0){
ctr++;
}

}
if(ctr==1){
System.out.println(n + " is prime number");
}
else{
System.out.println(n+" is not prime number");
}
}


}
