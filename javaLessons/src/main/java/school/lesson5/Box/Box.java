package school.lesson5.Box;

import java.util.ArrayList;

public class Box <T extends Fruits>{
    private ArrayList<T> box;

    public Box() {
        this.box = new ArrayList<T> ();
    }

    public void addFruit(T fruit,int quant) {
        for (int i = 0; i < quant; i++) {
            box.add(fruit);
        }
    }

    public float getBoxWeight() {
        if (box.size() == 0) {
            return 0;
        }
        return box.size() * box.get(0).getWeight();
    }

    public boolean compare(Box box) {
        return getBoxWeight() == box.getBoxWeight();
    }

}
