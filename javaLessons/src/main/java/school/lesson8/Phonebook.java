package school.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private HashMap<Integer, String> phone = new HashMap<>();

    public Phonebook() {
    }

    public void add(Integer number, String name) {
        phone.put(number, name);
    }

    public void info() {
        for (Map.Entry<Integer, String> o : phone.entrySet()) {
            System.out.println("The phone number of " + o.getValue() + " is " + o.getKey());
        }
    }


    public void get(String name) {
        if (phone.containsValue(name)) {
            System.out.println("The phone number of " + name + ":");
            for (Map.Entry<Integer, String> o : phone.entrySet()) {
                if (o.getValue() == name) {
                    System.out.print(o.getKey() + ",");
                }
            }
            System.out.println();
        } else {
            System.out.println("There is no phone number of " + name);
        }

    }

}


