class Animal{
String name;
int age;
public Animal(String name, int age){
this.name=name;
this.age=age;
}

public class CreatObject{
public static void main(String args[]){
Animal cat=new Animal("Pulfi",2);
System.out.println("Name: "+ cat.name+" age: "+cat.age);
}
}

}
