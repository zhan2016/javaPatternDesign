/**
 * Created by cs on 2017/9/3.
 */
public class MallardDuck extends  Duck {
    public  MallardDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
