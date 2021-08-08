package school.lesson4.task8;

public class Circle implements Info {
    public int radius;
    public String colorBackground;
    public String colorBorder;

    public Circle(int radius, String colorBackground, String colorBorder) {
        this.radius = radius;
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
    }
    public void square(){
        double sq=2*3.14*radius*radius;
        System.out.println("The square of the circle is "+ sq);
    }
    public void perimeter(){
        double per=2*3.14*radius;
        System.out.println("The perimeter of the circle is "+ per);
    }
    public void infoShow(){
        System.out.printf("The circle has %s background and %s border", colorBackground,colorBorder );
        System.out.println();
    }
}
