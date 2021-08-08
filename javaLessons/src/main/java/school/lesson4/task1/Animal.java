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

    public void run() {
        System.out.println("Animal runs ");
    }

    public void swim() {
        System.out.println("Animal swims ");
    }

    public static int getQuantityAnimals() {
        return quantityAnimals;
    }

}
