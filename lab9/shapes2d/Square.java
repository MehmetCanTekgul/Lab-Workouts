package shapes2d;

public class Square {
    protected final int side;

    public int area(){
        return side*side;
    }

    public Square(int side) {
        this.side = side;
    }

    public String toString(){
        return "side= "+ side;
    }

    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if (obj.getClass().equals(this.getClass())) {
            Square c = (Square) obj;
            return side == c.side;
        }
        else return false;
    }
}
