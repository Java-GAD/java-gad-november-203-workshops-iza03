package polymorphism;


public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        drawShape(shape1);
        drawShape(shape2);
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }
}
