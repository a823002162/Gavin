package com.itheima_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
构造方法：
public SimpleDateFormat():构造一个SimpleDateFormat，使用默认模式和日期格式
public SimpleDateFormat():构造一个SimpleDateFormat使用给定的模式和默认的日期格式
格式化：从Date到String
public final String format(Date date):将日期格式化成日期/时间字符串

解析：从String 到Date
public Date parse (String source):从给定字符串的开始解析问题以生成日期
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化，从Date到String
        Date d = new Date();//创建一个日期对象d
        SimpleDateFormat sdf = new SimpleDateFormat();//创建一个format(默认显示模式)对象sdf
        String s = sdf.format(d);//将对象d通过sdf调用format方法，最终转化为字符串s
        System.out.println(s);

        //使用给定的模式显示日期
        Date d1 = new Date();
        SimpleDateFormat sss = new SimpleDateFormat("yyyy年MM月dd日HH：mm：ss");
        String x = sss.format(d1);
        System.out.println(x);
        System.out.println("---------");

        //从String到Date
        String ss = "2048-08-09 11:11:11";
        SimpleDateFormat sss1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sss1.parse(ss);
        System.out.println(parse);
    }
}
