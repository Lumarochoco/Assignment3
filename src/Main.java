import is.hi.rbd3.hbv202g.assignment3.backend.Greeter;
import is.hi.rbd3.hbv202g.assignment3.frontend.UserInterface;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        UserInterface ui = new UserInterface();
        String greeting;

        greeter.setEnglish();
        greeting=greeter.greet();
        ui.show(greeting);

        greeter.setGerman();
        greeting=greeter.greet();
        ui.show(greeting);
    }

}