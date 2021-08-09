package school.lesson4.task1;

public class Dog extends Animal {
//    String color;
    int maxRun;
    int maxSwim;
    private  static int quantityDogs;



    public Dog(String name, int maxRun, int maxSwim) {
        super(name);
        this.maxRun =maxRun;
        this.maxSwim=maxSwim;
        quantityDogs++;
//        this.color = color;
    }
    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }
    public int getMaxRun() {
        return maxRun;
    }
    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }
    public int getMaxSwim() {
        return maxSwim;
    }

    public void run(int distance) {
        if (distance <= this.getMaxRun() && distance >= 0) {
            System.out.printf("Dog %s runs " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("The distance cann't be less than 0 ");
        } else {
            System.out.printf("Dogs can run only %d  from %d distance", getMaxRun(), distance );
            System.out.println();
        }
    }

    public void swim(int distance) {
        if (distance <= getMaxSwim() && distance >= 0) {
            System.out.printf("Dog %s swims " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("The distance cann't be less than 0 ");
        } else {
            System.out.printf("Dogs can swim only %d from %d distance", getMaxSwim(), distance);
            System.out.println();
        }

    }

    public static int getQuantityDogs() {
        return quantityDogs;
    }
}
