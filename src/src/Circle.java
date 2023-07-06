public class Circle {
    protected double radius;
    protected double x,y;
    public Circle(){
        this.radius = 1;
        this.x = 1;
        this.y = 1;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getArea(){
        return Math.PI*(radius*radius);
    }
}
