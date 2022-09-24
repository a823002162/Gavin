package itheima_08;

/*
StringBuilder转换为String
public String toString():通过toString()就可以实现把StringBuilder转换为String

String转换为StringBuilder
public StringBuilder(String s):通过构造方法就可以实现把String转换为StringBuilder
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        /*
        //StringBuilder转换为String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        //String s = sb;  这个是错误的做法,应为类型不一样
                String s = sb.toString();
        System.out.println(s);
        */

        //String转换为StringBuilder
        String s = "hello";
        //  StringBuilder sb = s; //这是个错误的做法
        //public StringBuilder(String s):通过构造方法就可以实现把String转换为StringBuilder
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

    }
}
