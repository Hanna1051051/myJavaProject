package school.lesson4.task8;

public interface Info {
    default void square(){
        System.out.println( "The square of the figure");
    };
    default void perimeter(){
        System.out.println( "The square of the perimeter");
    };
    public void infoShow();

}

