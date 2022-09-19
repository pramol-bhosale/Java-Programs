import java.util.Arrays;
public class ArrayCopy{
public static void main(String args[]){
int arr[]={1,2,3,4,5,6};
int arr2[]=new int[6];
for(int i=0;i<arr.length;i++){
arr2[i]=arr[i];
}
System.out.println("Array after copy :"+ Arrays.toString(arr2));


}

}
