package school.lesson4.task1;

public class Dog extends Animal {
    String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }


    public void run(int distance) {
        if (distance <= 500 && distance >= 0) {
            System.out.printf("Dog %s runs " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("The distance cann't be less than 0 ");
        } else {
            System.out.println("Dogs cann't run such long distances as " + distance);
        }
    }

    public void swim(int distance) {
        if (distance <= 10 && distance >= 0) {
            System.out.printf("Dog %s swims " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("The distance cann't be less than 0 ");
        } else {
            System.out.println("Dogs cann't swim such long distances as " + distance);
        }

    }
}
