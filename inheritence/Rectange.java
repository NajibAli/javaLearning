public class Rectange extends Shape{
    
    private int height;
    private int width;

    public Rectange(String name, String colour, int x, int y, int h, int w) {
        super(name, colour, x, y);
        this.height = h;
        this.width = w;

    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWidth(int w){
        this.width = w;
    }

    public int getWidth(){
        return this.width;
    }


    public boolean isSquare(){
        if (this.getWidth() == this.getHeight()) {
            return true;
        } else {
            return false;
        }
    }

    public double getArea() {
        double area = this.getHeight() * this.getWidth();
        return area;
    }

    public Point getCenterPoint() {
        // Don't really understand this
        return null;
    }
    
    public String toString(){
        return super.getName() + " " + super.getColour() + " " + super.getX() + " " + super.getY() + " " + this.getHeight() + " " + this.getWidth();
    }
}
