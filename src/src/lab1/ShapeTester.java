package lab1;

public class ShapeTester {
    public ShapeTester() {
    }
    public static boolean compareShape(Rectangle r, Circle c){
        return r.getX() == c.getX() && r.getY() == c.getY();
    }
    public static void compareArea(Rectangle r, Circle c){
        if(r.getArea() > c.getArea()){
            System.out.println("lab1.Rectangle is bigger");
        }
        else if(r.getArea() < c.getArea()){
            System.out.println("lab1.Circle is bigger");
        }
        else{
            System.out.println("they are equal in size");
        }
    }
}
