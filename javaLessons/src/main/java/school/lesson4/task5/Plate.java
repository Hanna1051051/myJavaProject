package school.lesson4.task5;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

//    Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
//количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else {
            System.out.println(" Not enough food. This cat is still hungry");
            return false;
        }
    }

//    Добавить в тарелку метод, с помощью которого можно было бы добавлять
//еду в тарелку.
    public void addFood(int n) {
        if (n>0) {
            food += n;
            System.out.printf("the amount of %s food was added and in the plate is %s food ", n ,getFood());
            System.out.println();
        } else {
            System.out.println(" Wrong amount of added food");
        }
    }
    public int getFood() {
        return food;
    }
}
