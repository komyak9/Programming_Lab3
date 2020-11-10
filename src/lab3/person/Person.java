package lab3.person;

import lab3.nature.Surface;
import lab3.person.instruments.Clothing;
import lab3.person.instruments.Parachute;

public class Person {
    private final String name;
    private Clothing clothing;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Clothing clothing) {
        this(name);
        this.clothing = clothing;
    }

    public String getName(){
        return name;
    }

    public void thinking() {
        System.out.println("Я думаю...\nЯ сделал выводы!");
    }

    public void sitOn(Surface surface) {
        System.out.println(name + " садится на " + surface.whatTheSurface());
    }

    public void lookAround() {
        System.out.println(name + " оглядывается по сторонам...");
    }

    public void setClothing(Clothing clothing) {
        if (this.clothing != null) {
            this.clothing.takeOff();
        }
        this.clothing = clothing;
        this.clothing.takeOn();
    }

    public void jumpWithParachute(Parachute parachute) {
        System.out.println(name + " прыгает!");
        parachute.open();
        System.out.println(name + " приземлился.");
        parachute.close();
    }

    @Override
    public String toString(){
        return "Человек по имени " + name;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person)obj;
        return this.getName() == person.getName();
    }

    @Override
    public int hashCode()
    {
        return 21;
    }
}
