/**
 * Created by cs on 2017/9/3.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void peformFly()
    {
        flyBehavior.fly();
    }
    public  void peformQuack()
    {
        quackBehavior.Quack();
    }

    public  void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }

    public  void  setQuackBehavior(QuackBehavior qb)
    {
        quackBehavior = qb;
    }

    abstract  void display();

}
