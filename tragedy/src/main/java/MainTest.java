

/**
 * Created by cs on 2017/9/3.
 */
public class MainTest {
    public  static void  main(String[] args) {
        Duck model = new MallardDuck();
        model.peformFly();
        model.peformQuack();
        model.display();
        model.setFlyBehavior(new FlyWithWings());
        model.peformFly();
    }

}
