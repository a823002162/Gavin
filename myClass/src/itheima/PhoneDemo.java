package itheima;
/*
创建对象
格式:类名 对象名 = new 类名();
范例: Phone p = new Phone();

使用对象:
1.使用成员变量
格式: 对象名.变量名
范例: p.brand
2.使用成员方法
格式: 对象名.方法名()
范例: p.call()

测试类需要有main方法
 */
public class PhoneDemo {
    public static void main(String[] args) {
       Phone p = new Phone();
       //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand = "小米";
        p.price = 2999;
        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法
        p.call();
        p.sendMessage();
    }
}
