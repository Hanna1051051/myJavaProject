package school.lesson4.task1;

public class Cat extends Animal {
    int maxRun;
    private static int quantityCats;

    public Cat(String name, int maxRun) {
        super(name);
        this.maxRun = maxRun;
        quantityCats++;
    }
    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }
    public int getMaxRun() {
        return maxRun;
    }

    public void run(int distance) {
        if (distance <= this.getMaxRun() && distance >= 0) {
            System.out.printf("Cat %s runs " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("The distance cann't be less than 0 ");
        } else {
            System.out.printf("Cats can run only %d from %d " , getMaxRun(), distance);
            System.out.println();
        }
    }

    public void swim(int distance) {
        System.out.println("Cats don't swim");
    }

    public static int getQuantityCats() {
        return quantityCats;
    }
}
