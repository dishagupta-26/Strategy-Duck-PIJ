//DEcoy Duck extends Duck
public class DecoyDuck extends Duck {
    public DecoyDuck() {

        // initailaizing the behaviours
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Float();
        flyBehaviour = new FlyNoWay();
    }
}
