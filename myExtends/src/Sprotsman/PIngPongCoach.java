package Sprotsman;

public class PIngPongCoach extends Coach implements SpeakEnglish {
    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜喝大米粥");
    }

    public PIngPongCoach() {
    }

    public PIngPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
