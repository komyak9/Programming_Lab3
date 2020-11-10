package lab3;

import lab3.person.Person;
import lab3.person.instruments.*;
import lab3.nature.plants.*;
import lab3.nature.*;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Незнайка");
        Parachute parachute = new Parachute();
        Clothing clothing = new SpaceSuit();

        Leaf leaf = new Leaf(LeafColour.GREEN, LeafSize.SMALL);
        Bush bush = new Bush(leaf);
        Surface surface = new Ground(bush);
        FreshAir freshAir = new FreshAir();

        person.setClothing(clothing);
        person.jumpWithParachute(parachute);
        person.sitOn(surface);
        person.lookAround();

        freshAir.move();
        leaf.move(freshAir);

        freshAir.setIsMove(false);
        freshAir.move();
        leaf.move(freshAir);
    }
}
