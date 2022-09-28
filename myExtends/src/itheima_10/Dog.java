package itheima_10;

public class Dog extends Animal{
    public Dog(){}
    public Dog(String name,int age){
        super(name,age);
    }
    public void kanmen(){
        System.out.println("狗的职责是看门");
    }
}
