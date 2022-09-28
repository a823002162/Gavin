package itheima_10;

public class Cat extends Animal{
    public Cat(){}//无参构造方法
    //有参构造方法
    public Cat(String name,int age){
        //注意下面,不可以直接使用this,要使用super
        super(name,age);
    }
    public void zhualaoshu(){
        System.out.println("猫的职责是抓老鼠");
    }

}
