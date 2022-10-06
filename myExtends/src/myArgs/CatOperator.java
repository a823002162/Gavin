package myArgs;

public class CatOperator {
    public void useCat(Cat c){
        c.eat();
    }
    //类名作为形参,其实要的是这个类的对象

    //类名作为返回值
    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }
}
