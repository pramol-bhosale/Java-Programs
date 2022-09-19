public class Gcd2{
public static void main(String args[]){
int num1=20,num2=-30;
num1= num1<0 ? -num1 : num1;
num2= num2<0 ? -num2 : num2;
while(num1 != num2){
if(num1 > num2){
num1 -= num2;
}
else{
num2 -= num1;
}

}
System.out.println("GCD is "+ num1);


}


}
