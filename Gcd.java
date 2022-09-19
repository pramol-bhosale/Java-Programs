public class Gcd{
public static void main(String args[]){
// finding gcd using recursion method 
int num1=20,num2=-30;
num1=num1<0 ? -num1 : num1;
num2=num2<0 ? -num2 : num2;
int result=getGcd(num1,num2);
System.out.println("GCD is "+result);

}
static int getGcd(int n, int m){
int num1,num2;
if(n>m){
num2=n;
num1=m;
}
else{
num1=n;
num2=m;
}
if(num2 % num1 ==0){
return num1;
}
else{
int rem=num2%num1;
return getGcd(rem, num1);
}

}


}
