package Sprotsman2;

public class JumppingDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        JumppingOperator jump = new JumppingOperator();
        Jumpping j = new Cat();
        jump.useJumpping(j);
        Jumpping j2 = jump.getJumpping();
        j2.jump();
    }
}
