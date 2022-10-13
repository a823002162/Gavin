package ICFlash;

import java.util.Scanner;

/*
用来评估IC底座数量
利用不死神兔的例子来计算每天的产能
 */
public class ICFlash {
    public static void main(String[] args) {
        //创建IC烧录的数组
        double[] IC = new double[40];
        //键盘录入创建烧录座数量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入烧录座数量:");
        int x = sc.nextInt();
        //前几天产能不稳定,爬坡
        IC[0] = 0.7 * 2 * 10 * 3600 / (105 / x);
        IC[1] = (0.8 * 2 * 10 * 3600 / (105 / x)) + IC[0];
        IC[2] = (0.9 * 2 * 10 * 3600 / (105 / x)) + IC[1];
//        IC[3] = (0.95 * 2 * 10 * 3600 / (105 / x))+IC[2];
        //使用循环实现填充数组
        for (int i = 3; i < IC.length; i++) {
            IC[i] = IC[i - 1] + (0.95 * 2 * 10 * 3600 / (105 / x));
        }

        //创建每天产能的数组
        double[] AS = new double[40];
        //创建组装UPH
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入组装UPH:");
        int uph = ss.nextInt();
        //前几天产能不稳定,爬坡中
        AS[0] = 0;
        AS[1] = 0;
        AS[2] = 0;
        AS[3] = 0;
        AS[4] = 0;
        AS[5] = 0;
        AS[6] = 0;
        AS[7] = 0;
        AS[8] = 0;
        AS[9] = 0.5 * 10 * uph + AS[8];
        AS[10] = 0.6 * 10 * uph + AS[9];
        AS[11] = 0.8 * 10 * uph + AS[10];
        AS[12] = 0.8 * 10 * uph + AS[11];
        //使用循环实现填充数组
        for (int l = 13; l < AS.length; l++) {
            AS[l] = AS[l - 1] + 10 * uph;
        }
        //调用方法来找出关键天
        int day = isEven(IC, AS);
        System.out.println("第" + day + "天开始,烧录产能无法满足组装产能");

    }

    /*
    创建方法,用来比较烧录和组装产能,并输出关键的那一天
    两个明确:
    1.参数类型:数组
    2.返回值类型: int
     */
    public static int isEven(double arr[], double arr2[]) {
        int f = 0;
        //使用循环来遍历对比
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr2[i]) {
                f = i;
                break;
            }
        }
        return f;
    }
}
