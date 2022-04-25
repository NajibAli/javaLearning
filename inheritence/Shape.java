public abstract class Shape{

    private String name;
    private String colour;
    private int x;
    private int y;

    public Shape(String name, String colour, int x, int y) {
        this.name = name;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    public void setName(String name){
        this.name = name;
    };

    public String getName(){
        return this.name;
    };

    public void setColour(String colour){
        this.colour = colour;
    };

    public String getColour(){
        return this.colour;
    };

    public void setX(int x){
        this.x = x;
    };

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    };

    public int getY(){
        return this.y;
    }
    
    public abstract double getArea();
    public abstract Point getCenterPoint();

}
