import java.util.Scanner;

/*
需求：
评委打分
在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分
选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）
思路：
1：定义一个数组，用动态初始化完成数组元素的初始化，长度为6
2：键盘录入评委分数
3：由于是6个评委打分，所以，接收评委分数的操作，用循环改进
4：定义方法实现获取数组中的最高分（数组最大值），调用方法
5：定义方法实现获取数组中的最低分（数组最小值），调用方法
6：定义方法实现获取数组中的所有元素的和（数组元素求和），调用方法
7：按照计算规则进行计算得到平均分
8：输出平均分
 */
public class pingweidafen220921 {
    public static void main(String[] args) {
        int arr[] = new int[6]; //定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        Scanner sc = new Scanner(System.in);//键盘录入评委分数
//使用循环的方式接收评委的评分，并将评分存入数组arr中
        for (int i = 0; i < 6; i++) {
            System.out.println("请" + (i + 1) + "号评委打分");
            int score = sc.nextInt();
            arr[i] = score;
        }
        int max = getmax(arr);//获取数组中最高分
        int min = getmin(arr);//获取数组中最低分
        int sum = sum(arr);//对数组进行求和
        int average = (sum - max - min) / 4;//去掉最高分，去掉最低分，剩余分数4个评委平均值
        System.out.println("平均分数为：" + average);//输出平均值
    }

    //定义方法实现获取数组中的最高分
    /*
    两个明确
    1返回值类型 int
    2参数类型 int arr[]
     */
    public static int getmax(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }


    //定义方法实现获取数组中的最低分
     /*
    两个明确
    1返回值类型 int
    2参数类型 int arr[]
     */
    public static int getmin(int arr[]) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    //定义方法实现获取数组中各元素的和
    /*
    两个明确
    1返回值类型int
    2参数类型int arr[]
     */
    public static int sum(int arr[]) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }
}
