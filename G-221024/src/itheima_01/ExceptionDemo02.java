package itheima_01;

import java.lang.reflect.Array;

/*
try{
 可能出现异常的代码；
 } catch(异常类名 变量名）{
   异常的处理代码；
 }
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("你访问的数组索引不存在");
//            e.printStackTrace();
//            System.out.println(e.getMessage());
            //Index 3 out of bounds for length 3
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
}
/*
       public class getMessage{
       private String detailMessage;
       public Throwabel(String message){
detailMessage = message;
}
    public String getMessage() {
        return detailMessage;
    }
 */