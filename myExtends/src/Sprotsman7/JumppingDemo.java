package Sprotsman7;

public class JumppingDemo {
    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调用method方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);
        Jumpping D = new Dog();
        jo.method(D);
        System.out.println("------------");
        jo.method(new Jumpping(){
            @Override
            public void jump() {
                System.out.println("猫可以跳高啊");
            }
        });

        jo.method(new Jumpping(){
            @Override
            public void jump() {
                System.out.println("狗可以跳高啊");
            }
        });
    }
}
