public class Circle extends Shape{
    
    private int radius;

    public Circle(String name, String colour, int x, int y, int r) {
        super(name, colour, x, y);
        this.radius = r;

    }

    public void setRadius(int r){
        this.radius = r;
    }

    public int getRadius(){
        return this.radius;
    }

    public double getArea() {
        double area = Math.PI * (this.getRadius() * this.getRadius());
        return area;
    }

    public Point getCenterPoint() {
        return null;
    }
    
    public String toString(){
        return super.getName() + " " + super.getColour() + " " + super.getX() + " " + super.getY() + " " + this.getRadius();
    }

}
