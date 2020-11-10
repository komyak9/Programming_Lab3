package lab3.nature.plants;

import lab3.nature.Air;
import lab3.person.Person;

public class Leaf {
    private LeafColour leafColour;
    private LeafSize leafSize;

    public Leaf(){
        leafColour = LeafColour.GREEN;
        leafSize = LeafSize.MEDIUM;
    }

    public Leaf(LeafColour leafColour, LeafSize leafSize){
        this.leafColour = leafColour;
        this.leafSize = leafSize;
    }

    public LeafColour getLeafColour() {
        return leafColour;
    }

    public void setLeafColour(LeafColour leafColour) {
        this.leafColour = leafColour;
    }

    public LeafSize getLeafSize() {
        return leafSize;
    }

    public void setLeafSize(LeafSize leafSize) {
        this.leafSize = leafSize;
    }

    public void move(Air air) {
        if (air.getIsMove()) {
            System.out.println("Листья колышутся.");
        }
        else{
            System.out.println("Листья не колышутся.");
        }
    }

    @Override
    public String toString(){
        return "листья " + this.getLeafSize() + " и " + this.getLeafColour();
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Leaf leaf = (Leaf)obj;
        return this.getLeafColour() == leaf.getLeafColour() && this.getLeafSize() == leaf.getLeafSize();
    }
    @Override
    public int hashCode()
    {
        return 40;
    }
}
