import java.util.Scanner;
import java.util.Arrays;
public class LeftRotateArray{
public static void main(String args[]){
int arr[]={1,2,3,4,5,6};
Scanner sc=new Scanner(System.in);
System.out.println("How many times you want to left rotate ??");
int rot=sc.nextInt();
while(rot!=0){
int first=arr[0];
for(int i=0;i<arr.length-1;i++){
arr[i]=arr[i+1];
}
arr[arr.length-1]=first;
rot--;
}
System.out.println("Array element after rotation: "+ Arrays.toString(arr));

}

}
