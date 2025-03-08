public class Main {
    public static void main(String[] args) {

        // creating objects of all ducks
        MallardDuck md = new MallardDuck();
        RedHeadDuck rhd = new RedHeadDuck();
        RubberDuck rd = new RubberDuck();
        DecoyDuck dd = new DecoyDuck();

        // calling display method of all ducks
        System.out.println("------------------");
        md.display();
        System.out.println("------------------");
        rhd.display();
        System.out.println("------------------");
        rd.display();
        System.out.println("------------------");
        dd.display();
        System.out.println("------------------");
    }
}
