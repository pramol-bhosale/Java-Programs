import java.util.Scanner;
public class Prime2{
public static void main(String args[]){
int ctr,n;
Scanner sc=new Scanner(System.in);
System.out.println("Which prime number you want ?");
n=sc.nextInt();
boolean flag=true;
int i=0,k=0;
while(flag){
ctr=0;
	for(int j=1;j<=(i/2);j++){
	if(i%j==0){
	ctr++;
	}
	}
	if(ctr==1){
	k++;
	}
	if(k==n){
	System.out.println(n+"th prime number is "+i);
	break;
	}
	i++;


}

}


}
