package shapes3d;

import shapes2d.Square;

public class Cube extends Square {

    public Cube(int side) {
        super(side);
    }
    @Override
    public int area(){
        return 6 * super.area();

    }
    public int volume(){
        return side * super.area();
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Cube){
            Cube c = (Cube) obj;
            return side==side;

        }
        return false;
    }
}
