public class Prime{
public static void main(String args[]){
int ctr;
for(int i=1;i<=100;i++){
	ctr=0;
for(int j=1;j<=(i/2);j++){
if(i%j==0){
ctr++;
}
}
if(ctr==1){
System.out.println(i);
}
}

}
}
