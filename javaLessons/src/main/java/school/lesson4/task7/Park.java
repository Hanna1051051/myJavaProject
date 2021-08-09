package school.lesson4.task7;

public class Park {
    class Attraction {
        private String workingHours ;
        private String name ;
        private int cost ;
        public Attraction (String name, String workingHours, int cost){
            this.name= name;
            this.workingHours=workingHours;
            this.cost=cost;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }
        public String getWorkingHours() {
            return workingHours;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
        public int getCost() {
            return cost;
        }

        public void info() {
            System.out.printf("The attraction %s is working %s. The cost is %d", getName(), getWorkingHours(), getCost());
            System.out.println();
        }
        public void cost() {
            System.out.printf("The attraction %s costs %d \n", getName(), getCost());
        }
        public void open() {
            System.out.printf("The attraction %s is working %s \n", getName(), getWorkingHours());
        }
        public void name() {
            System.out.printf("The attraction %s is .....\n", getName());
        }
    }





    public static void main(String[] args) {
        Park.Attraction att1 = new Park().new Attraction("raduga"," from 9 till 20",15);
        att1.name();
        att1.cost();
        att1.open();
        Park.Attraction att2 = new Park().new Attraction("solnce"," from 10 till 18",5);
        att2.name();
        att2.cost();
        att2.open();
        att2.info();


    }
}
