package school.lesson4.task1;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);

    }


    public void run(int distance) {
        if (distance <= 200 && distance >= 0) {
            System.out.printf("Cat %s runs " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("The distance cann't be less than 0 ");
        } else {
            System.out.println("Cats cann't run such long distances as " + distance);
        }
    }

    public void swim(int distance) {
        System.out.println("Cats don't swim");
    }
}
