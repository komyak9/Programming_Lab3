package lab3.nature.planet;

import lab3.nature.Air;
import lab3.nature.Surface;

import java.util.Objects;

public abstract class Planet {
    private final Surface surface;
    private final Air air;

    public Planet(Surface surface, Air air){
        this.surface = surface;
        this.air = air;
    }

    public void getAir(){
        System.out.println(air.toString() + " на " + this + ".");
    }

    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), surface, air);
    }
}
