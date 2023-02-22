package itheima02;
/*
哈希值:
是JDK根据对象的地址或者字符串或者数字计算出来的int类型的数值
object类中有一个方法可以获取对象的哈希值
public int hashCode():返回对象的哈希值码值
 */
public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("林青霞",30);
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode());//668386784
        System.out.println(s1.hashCode());//668386784

        System.out.println("---------------------------------");

        Student s2 = new Student("林青霞",30);
        //默认情况下,不同对象的哈希值是不同的(可以通过类中重写方法的方式实现不同对象相同hash值)
        System.out.println(s2.hashCode());//1329552164

        System.out.println("---------------------------------");
        //几个常用字符串的哈希值
        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818

        System.out.println("---------------------------------");
        //几个汉字的哈希值(String重写了哈希值的方法)
        //hashCode()相等即两个键值对的哈希值相等,然后哈希值相等,并不一定能得出键值对相等
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

        System.out.println("---------------------------------");
        //test
        System.out.println("ss".hashCode());
        System.out.println("bb".hashCode());
    }
}
