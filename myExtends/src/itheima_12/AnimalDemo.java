package itheima_12;
/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象,调用方法
        Animal c = new Cat();
        c.setName("加菲猫");
        c.setAge(20);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        System.out.println("----------------------------");

        c= new Cat("加菲猫2",22);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        System.out.println("----------------------------");

        Animal d = new Dog();
        d.setName("小山");
        d.setAge(20);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        System.out.println("---------------------------");

        d = new Dog("小山2",33);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        System.out.println("----------------------------");
    }
}
