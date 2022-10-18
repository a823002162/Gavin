package comitheima_03;
/*
构造方法：
public Integer(int value):根据int值创建Integer对象（过时）
public Integer（String s）：根据String值创建Integer对象（过时）

静态获取对象：
public static Integer valueOf（int i）：返回表示指定的int值的Integer实例
public static Integer valueOf（String s）：返回一个保存指定值的Integer对象String
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //public Integer(int value):根据int值创建Integer对象（过时）
//        Integer i1 = new Integer(100);
//        System.out.println(i1);

        //public Integer（String s）：根据String值创建Integer对象（过时）
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);

//        Integer i3 = Integer.valueOf("aaabbbccc");  //NumberFormatException数据格式不对
//        System.out.println(i3);
    }
}
