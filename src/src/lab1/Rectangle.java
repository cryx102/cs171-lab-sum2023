package lab1;

public class Rectangle {
    private double L,H,x,y;

    public Rectangle() {
        L=1;
        H=2;
        x=1;
        y=1;
    }

    public double getL() {
        return L;
    }

    public void setLength(double l) {
        L = l;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea(){
        return L*H;
    }
}
