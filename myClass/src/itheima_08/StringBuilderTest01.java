package itheima_08;

/*
需求:
定义一个方法,把int数组中的数据按照指定的格式拼接成一个字符串返回,调用该方法,并在控制台输出结果
例如,数组为int[] arr = {1,2,3};,执行方法后的输出结果为:[1, 2, 3]
思路:
1:定义一个int类型的数组,用静态初始化完成数组元素的初始化
2:定义一个方法,用于把int数组中的数据按照指定格式拼接成一个字符串返回.
返回值类型String,参数列表int[] arr
3:在方法中用StringBuilder按照要求进行拼接,并把结果转成String返回
4:调用方法,用一个变量接收结果
5:输出方法
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //定义一个int类型数组,用静态初始化完成数组元素的初始化
        int arr[] = {1, 2, 3};
        String x = addint(arr);
        System.out.println(x);
    }

    /*
    定义一个方法,把int数组中的数据按照指定格式拼接成一个字符串返回
    定义方法,要想到两个明确
    1.返回值类型:String
    2.参数int arr[]
     */
    public static String addint(int arr[]) {
        StringBuilder sc = new StringBuilder();
        sc.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sc.append(arr[i]);
            } else {
                sc.append(arr[i]).append(", ");
            }
        }
        sc.append("]");
        //将StringBuilder类型转换成String
        String s = sc.toString();
        return s;
    }
}
