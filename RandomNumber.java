import java.lang.Math;
public class RandomNumber{
public static void main(String args[]){
int max=100;
int min=10;
int rand_num=(int)(Math.random()*(max-min+1)+min);
System.out.println("Random number between "+min+" to "+max +" is "+rand_num);

}

}
