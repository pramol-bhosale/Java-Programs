import java.util.Arrays;
public class ArrayElementFrequency{
public static void main(String args[]){
int arr[]={3,33,3,1,2,2,3,4,5,5,4,3};
Arrays.sort(arr);
int skip=0;
int freq=0;
for(int i=0;i<arr.length;i++){
freq=0;
if(skip!=0){
skip--;
continue;
}
for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){
skip++;
freq++;
}
else if(arr[i]<arr[j]){
break;
}

}
System.out.println(arr[i]+" occured "+ (freq+1) +" times");

}

}


}
