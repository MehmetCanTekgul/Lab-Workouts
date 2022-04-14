package shapes2d;

import javax.sound.midi.Soundbank;

public class TestShapes2d {
    public static void main(String[] args){
        Circle c1= new Circle(5);
        c1= new Circle(6);
        Circle c2 = new Circle(6);
        String str = new String("Hello"); // immutable
        String str2= "Hola";

        System.out.println(str.equals(str2)); // Correct Comparison

        System.out.println("c1 == c2: " + (c1 == c2));

        System.out.println("c1.equals(c2) " + (c1.equals(c2)));
    }
}
