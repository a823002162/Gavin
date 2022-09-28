package itheima_10;
/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //猫:创建对象,调用方法
        Cat cat = new Cat();
        cat.setName("猫");
        cat.setAge(20);
        System.out.println(cat.getName()+","+cat.getAge());
        cat.zhualaoshu();

        Cat cat1 = new Cat("猫2",22);
        System.out.println(cat1.getName()+","+cat1.getAge());
        cat.zhualaoshu();

        //狗:创建对象,调用方法
        Dog dog = new Dog();
        dog.setName("狗");
        dog.setAge(50);
        System.out.println(dog.getName()+","+dog.getAge());
        dog.kanmen();

        Dog dog1 = new Dog("狗2",43);
        System.out.println(dog1.getName()+","+dog1.getAge());
        dog.kanmen();
    }
}
