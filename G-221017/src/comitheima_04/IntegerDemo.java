package comitheima_04;
/*
装箱：把基本数据类型转换为对应的包装类类型
拆箱：把包装类类型转换为对应的基本数据类型
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);//调用方法实现装箱
        Integer ii = 100;//自动装箱 Integer.valueOf(100)

        //拆箱：把包装类类型转换为对应的基本数据类型
        //ii += 200;
       ii =  ii.intValue()+200;//手动拆箱
       ii += 200;//自动拆箱和自动装箱
        System.out.println(ii);

        Integer iii = null;
        if(iii!=null){
            iii += 300;//NullPointerException
            //正式的开发过程中，如果要使用引用类型的数据，
            //那么在使用之前最好判断一下该引用类型是不是空指针
        }


    }
}
