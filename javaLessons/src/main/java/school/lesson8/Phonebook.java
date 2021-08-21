package school.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(11111, "Petrov");
        hm.put(11112, "Petrov");
        hm.put(11113, "Petrov");
        hm.put(222222, "Ivanov");
        hm.put(33333, "Sidorow");
        hm.put(44445, "Buzo");
        hm.put(44446, "Buzo");
        hm.put(44447, "Buzo");
        hm.put(44448, "Buzo");
        hm.put(44449, "Buzo");
        hm.put(55555, "Kesso");




        for (Map.Entry<Integer, String> o : hm.entrySet()) {
            System.out.println("The phone number of "+ o.getValue()+ " is "+ o.getKey() );
        }

        String lastName1 = "Petrov";
        String lastName2 = "Kesso";
        String lastName3 = "Petrova";

        String lastName= lastName1;


        if (hm.containsValue(lastName)) {
            System.out.println("The phone number of " + lastName + ":");
            for (Map.Entry<Integer, String> o : hm.entrySet()) {
                if (o.getValue() == lastName) {
                    System.out.print(o.getKey() + ",");
                }
            }
        } else {
            System.out.println("There is no phone number of " + lastName );
        }

    }

}


