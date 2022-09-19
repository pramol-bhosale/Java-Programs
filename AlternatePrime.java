import java.util.Scanner;
public class AlternatePrime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number upto which you want to print alternate prime number :");
int n=sc.nextInt();
boolean flag=true;
for(int i=1;i<=n;i++){
if(IsPrime(i)){
if(flag){
System.out.println(i);
flag=false;
}
else{
flag=true;
}

}

}

}
static boolean  IsPrime(int n){
int ctr=0;
for(int i=1;i<=(n/2);i++){
if(n%i==0){
ctr++;
}

}
if(ctr==1){
return true;
}
else{
return false;
}


}

}
