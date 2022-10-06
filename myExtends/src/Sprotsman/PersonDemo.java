package Sprotsman;
/*
测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象,无参构造方法创建对象,还可以带参构造
        PingPongPlayer ppp= new PingPongPlayer();
        ppp.setName("王浩");
        ppp.setAge(20);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.speak();
        ppp.study();
        System.out.println("-------------------------");

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
    }
}
