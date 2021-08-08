package school.lesson4.task8;

public class MainFigure {
    public static void main(String[] args) {
        Circle circle1= new Circle(5,"red","grey");
        Rectangle rectangle1= new Rectangle(6,3, "blue", "brown");
        Triangle triangle1= new Triangle(3,4,5, "orange", "maroon");
        circle1.square();
        circle1.perimeter();
        circle1.infoShow();
        rectangle1.square();
        rectangle1.perimeter();
        rectangle1.infoShow();
        triangle1.square();
        triangle1.perimeter();
        triangle1.infoShow();
    }
}
