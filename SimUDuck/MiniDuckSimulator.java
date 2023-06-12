package SimUDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        
        MallardDuck mDuck = new MallardDuck();
        mDuck.flyBehavior.fly();
        mDuck.display();
    }
}
