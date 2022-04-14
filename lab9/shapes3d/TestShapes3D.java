package shapes3d;

import jdk.swing.interop.SwingInterOpUtils;
import shapes2d.Square;

import java.util.concurrent.Callable;

public class TestShapes3D {
    public static void main(String [] args){

        Square s = new Square(5);
        Cube c = new Cube(5);
        System.out.println("c.equals : "+c.equals(s));
        System.out.println("s.equals : " + s.equals(c));

        Cylinder cy = new Cylinder(4,7);
        System.out.println(cy.area());
        System.out.println(cy.volume());
        System.out.println(cy);
    }
}
