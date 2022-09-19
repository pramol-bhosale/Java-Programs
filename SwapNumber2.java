public class SwapNumber2{
public static void main(String args[]){
// swapping number without using third variable

	int a=10,b=20;
	System.out.println("Before Swapping : ");
	System.out.println("a="+a+" and b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping :");
	System.out.println("a= "+a+" and b= "+b);

}

}
