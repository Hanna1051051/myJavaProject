package school.lesson4.task5;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 20);
        Plate plate = new Plate(100);
        plate.info();
        plate.addFood(5);
        plate.info();

//        Создать массив котов и тарелку с едой, попросить всех котов покушать из
//этой тарелки и потом вывести информацию о сытости котов в консоль.

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Leo", 40);
        catArray[1] = new Cat("Lucky", 100);
        catArray[2] = new Cat("Monika", 25);
        catArray[3] = new Cat("Laisy", 45);
        catArray[4] = new Cat("Lama", 5);


        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
            plate.info();
        }
    }
}

