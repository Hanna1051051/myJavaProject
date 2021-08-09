package school.lesson4.task1;

public class Animal {
    String name;
    private static int quantityAnimals;

    public Animal() {
    }

    public Animal(String name) {
        quantityAnimals++;
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void run( int distance) {
        System.out.printf("Animal %s runs %d", getName(),distance);
        System.out.println();
    }

    public void swim( int distance) {
        System.out.printf("Animal %s swims %d", getName(),distance);
        System.out.println();
    }

    public static int getQuantityAnimals() {
        return quantityAnimals;
    }

}
