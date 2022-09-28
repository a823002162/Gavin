package itheima_11;

/*
测试类，需要有main方法
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();


    }
}
