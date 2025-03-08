// Mallard Duck extends Duck
public class MallardDuck extends Duck {
    public MallardDuck() {

        // initailaizing the behaviours
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
        flyBehaviour = new FlyWithWings();
    }
}
