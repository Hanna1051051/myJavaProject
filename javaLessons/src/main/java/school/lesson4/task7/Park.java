package school.lesson4.task7;

public class Park {
    class Raduga {
        private String workingHours = "from 9 till 22 everyday";
        private String name = "Raduga";
        private int cost = 15;
        public void info() {
            System.out.printf("The attraction %s is working %s. The cost is %d", name, workingHours,cost);
            System.out.println();
        }
        public void cost() {
            System.out.printf("The attraction %s costs %d", name, cost);
            System.out.println();
        }
        public void open() {
            System.out.printf("The attraction %s is working %s", name, workingHours);
            System.out.println();
        }
        public void name() {
            System.out.printf("The attraction %s is .....", name);
            System.out.println();
        }
    }
    void infoRaduga () {
        Raduga rad= new Raduga();
        System.out.printf("The attraction %s is working %s. The cost is %d", rad.name, rad.workingHours,rad.cost);
        System.out.println();
    }




    public static void main(String[] args) {
        Park.Raduga raduga = new Park().new Raduga();
        raduga.name();
        raduga.cost();
        raduga.open();

        Park park1 = new Park();
        park1.infoRaduga();
    }
}
