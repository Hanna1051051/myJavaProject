package school.lesson4.task6;

public class Payment {
    class Tablet {
        private boolean isBuy = true;
        public void buy(){
            System.out.println("Tablet-The purchase is done");
        }
    }
    class Mobile {
        private boolean isBuy = true;
        public void buy(){
            System.out.println("Mobile-The purchase is done");
        }
    }
    class TV {
        private boolean isBuy = true;
        public void buy(int sm){
            System.out.printf("TV - in quantity of %s  TV-The purchase is done", sm);
            System.out.println();
        }
    }
    class SmartWatch {
        private boolean isBuy = true;

        public void buy( String m,int sm) {
            System.out.printf("SmartWatch-model %s - in quantity of %s - The purchase is done", m,sm);
            System.out.println();
        }
    }
    Tablet t1= new Tablet();
    Mobile m1= new Mobile();
    TV tv1=new TV();
    SmartWatch sm1= new SmartWatch();






}
