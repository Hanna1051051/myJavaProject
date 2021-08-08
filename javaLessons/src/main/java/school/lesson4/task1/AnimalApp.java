package school.lesson4.task1;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Friendly");
        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Charly", "grey");
        Cat cat2 = new Cat("Leopald");
        Dog dog2 = new Dog("Vasiliy", "brown");
        animal.run();
        cat1.run(200);
        cat1.swim(20);
        cat2.run(300);
        dog1.run(-50);
        dog1.swim(10);
        dog2.run(550);
        dog2.swim(5);

//4. * Добавить подсчет созданных котов, собак и животных.
        System.out.printf("The amount of aminals is  - %s . \n", Animal.getQuantityAnimals());
    }
}


