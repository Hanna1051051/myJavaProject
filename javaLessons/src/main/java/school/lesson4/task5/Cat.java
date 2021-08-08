package school.lesson4.task5;

public class Cat {
    private String name;
    private int appetite;
    private boolean noHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        noHungry = false;
    }

//    Каждому коту нужно добавить поле сытость (когда создаем котов, они
//голодны). Если коту удалось покушать (хватило еды), сытость = true.
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            System.out.printf("Cat %s is full. Cat has eaten " + appetite, name);
            System.out.println();
            noHungry = true;
        } else {
            noHungry = false;
        }
    }
//    public void setAppetite(int appetite) {
//        this.appetite = appetite;
//    }

    public int getAppetite() {
        return appetite;
    }
}
