package lab3.person.instruments;

import lab3.person.Person;

public class Parachute {

    public void open() {
        System.out.println("Парашют открывается и замедляет падение!");
    }

    public void close() {
        System.out.println("Парашют закрыт и сложен.");
    }

    @Override
    public String toString(){
        return "Парашют";
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode()
    {
        return 8;
    }
}
