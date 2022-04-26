public class ShapeDemo {
    public static void main(String[] args) {
        Rectange s = new Rectange("square", "red", 1,2, 4, 10);
        Circle c = new Circle("round", "blue", 4, 8, 4);

        System.out.println(s.toString());
        System.out.println(s.getArea());
        System.out.println(s.isSquare());
        System.out.println(s.getCenterPoint());


        // System.out.println(c.toString());
        // System.out.println(c.getArea());

    }
}
