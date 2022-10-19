package comitheima_04;

import java.util.Date;

/*
public Date():分配一个Date对象，并初始化，以便代表它被分配的时间，精确到毫秒
public Date(long date): 分配一个Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
 */
public class DateDemo {
    public static void main(String[] args) {
        //public Date():分配一个Date对象，并初始化，以便代表它被分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);

        //public Date(long date): 分配一个Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        long date = 1*60*60*1000;//1点，1小时60分钟，1分钟60秒，1秒1000毫秒
        Date d2 = new Date(date);
        System.out.println(d2);
    }
}
