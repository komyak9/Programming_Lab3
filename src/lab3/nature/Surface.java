package lab3.nature;

public abstract class Surface {
    public String whatTheSurface() {
        return toString() + '.';
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode()
    {
        return 848;
    }
}
