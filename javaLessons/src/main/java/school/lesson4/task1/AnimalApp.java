package school.lesson4.task1;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Friendly");
        Cat cat1 = new Cat("Barsik",200);
        Dog dog1 = new Dog("Charly",500, 10);
        Cat cat2 = new Cat("Leopald",200);
        Dog dog2 = new Dog("Vasiliy",500,10);
        animal.run(50);
        animal.setName("Frank");
        animal.swim(15);
        cat1.getMaxRun();
        dog2.getMaxSwim();
//        dog2.setMaxSwim(15);
//
        cat1.run(200);
        cat1.swim(20);
        cat2.run(300);
        dog1.run(-50);
        dog1.swim(10);
        dog2.run(550);
        dog2.swim(5);

//4. * Добавить подсчет созданных котов, собак и животных.
        System.out.printf("The amount of aminals is  - %s and among them  -%d cats and  -%d dogs. \n", Animal.getQuantityAnimals(), Cat.getQuantityCats(), Dog.getQuantityDogs());
    }
}


