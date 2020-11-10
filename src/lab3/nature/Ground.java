package lab3.nature;

import lab3.nature.plants.Bush;
import lab3.nature.plants.Plant;

public class Ground extends Surface {
    private Plant plant;

    public Ground() {
        plant = new Bush();
    }

    public Ground(Plant plant){
        this();
        this.plant = plant;
    }

    @Override
    public String toString(){
        return "земельная поверхность, растения: " + plant.toString();
    }
}
