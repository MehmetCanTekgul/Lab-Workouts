public class TestCircle {

    public static void main(String []args){
    Circle c = new Circle(8,new Point(15,12));
        System.out.println("Area of the circle is "+ c.area());
        System.out.printf("Perimeter of the circle is "+ c.perimeter());

    Circle c2 = new Circle(5, new Point(22,22));

    if (c.intersect(c2)){
        System.out.printf("Circles Are Intersected");
    }else
        System.out.printf("Circles Are Not Intersected");
    }
}

