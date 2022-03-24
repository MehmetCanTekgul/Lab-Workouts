public class TestRectangle {

    public static void main(String[] args){
        Rectangle r = new Rectangle(new Point(3,2),10,12);
        System.out.println("Area Of Rectangle is "+ r.area());
        System.out.println("Perimeter Of Rectangle is "+ r.perimeter());

        Point[] corners = r.corners();

        for (int i=0;i<corners.length;i++){
            Point p = corners[i];

            if (p== null)
                System.out.println("p is null ");
            else{
                System.out.println("Corner " + (i+1)+ " x = " + p.getxCoord()+ " y = " + p.getyCoord());
            }
        }

    }
}
