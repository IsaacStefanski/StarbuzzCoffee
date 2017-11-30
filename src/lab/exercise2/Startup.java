package lab.exercise2;

/**
 *
 * @author Isaac
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        // do output for decorated shapes here...
        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle with red border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }
}