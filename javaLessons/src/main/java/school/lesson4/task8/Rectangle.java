package school.lesson4.task8;

public class Rectangle implements Info {
    public int side1;
    public int side2;
    public String colorBackground;
    public String colorBorder;

    public Rectangle(int side1, int side2, String colorBackground, String colorBorder){
        this.side1 =side1;
        this.side2 =side2;
        this.colorBackground= colorBackground;
        this.colorBorder=colorBorder;

    }
    public void square(){
        double sq=side1*side2;
        System.out.println("The square of the rectangle is "+ sq);
    }
    public void perimeter(){
        double per=2*side1*side2;
        System.out.println("The perimeter of the rectangle is "+ per);
    }
    public void infoShow(){
        System.out.printf("The rectangle has %s background and %s border", colorBackground,colorBorder );
        System.out.println();
    }
}

