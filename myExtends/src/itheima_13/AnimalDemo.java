package itheima_13;
/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("-------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("------");

        a=new Cat("加菲升级版",10);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("------");

        //上面两种用法不是我们生活中最常用的，最常用的是下面这种实现类
        Cat c = new Cat();
        c.setName("加菲222");
        c.setAge(10);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
