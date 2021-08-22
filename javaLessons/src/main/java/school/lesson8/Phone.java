package school.lesson8;

public class Phone {

    public static void main(String args[]) {

        Phonebook phone = new Phonebook();
        phone.add(11111, "Petrov");
        phone.add(11112, "Petrov");
        phone.add(11113, "Petrov");
        phone.add(222222, "Ivanov");
        phone.add(33333, "Sidorow");
        phone.add(44445, "Buzo");
        phone.add(44446, "Buzo");
        phone.add(44447, "Buzo");
        phone.add(44448, "Buzo");
        phone.add(44449, "Buzo");
        phone.add(55555, "Kesso");

        phone.info();

        phone.get("Petrov");
        phone.get("Petrova");
        phone.get("Ivanov");
    }
}


