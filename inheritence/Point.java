public class Point {
    private double x;
    private double y;

    Point(double d, double e){
        this.x = d;
        this.y = e;
    }

    public void setX(int x){
        this.x = x;
    };
    public void setY(int y){
        this.y = y;
    };
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    public String toString(){
        return "X: " + this.getX() + " Y: " + this.getY();
    }
}
