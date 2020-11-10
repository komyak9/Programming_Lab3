package lab3.nature.plants;

public abstract class Plant {
    public String whatThePlant() {
        return toString();
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode()
    {
        return 44;
    }
}
