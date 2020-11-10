package lab3.nature;

public class Air implements Atmosphere {
    protected boolean isMove;

    public Air() {
        isMove = true;
    }

    public void move() {
        if (getIsMove()) {
            System.out.println("Дует " + this + "...");
        }
        else{
            System.out.println("Тихо, " + this + " не дует.");
        }
    }

    public boolean getIsMove() {
        return isMove;
    }

    public void setIsMove(boolean isMove) {
        this.isMove = isMove;
    }

    @Override
    public String toString(){
        return "Воздух";
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode()
    {
        return 9;
    }
}
