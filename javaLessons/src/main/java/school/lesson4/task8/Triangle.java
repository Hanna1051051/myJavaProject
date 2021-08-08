package school.lesson4.task8;

public class Triangle implements Info {
    public int side1;
    public int side2;
    public int side3;
    public String colorBackground;
    public String colorBorder;

    public Triangle(int side1, int side2, int side3, String colorBackground, String colorBorder){
        this.side1 =side1;
        this.side2 =side2;
        this.side3 =side3;
        this.colorBackground= colorBackground;
        this.colorBorder=colorBorder;
    }

    public void square(){
        int p=(side1+side2+side3)/2;
        double sq=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        System.out.println("The square of the triangle is "+ sq);
    }
    public void perimeter(){
        double per=side1+side2+side3;
        System.out.println("The perimeter of the triangle is "+ per);
    }
    public void infoShow(){
        System.out.printf("The triangle has %s background and %s border", colorBackground,colorBorder );
        System.out.println();
    }
}
