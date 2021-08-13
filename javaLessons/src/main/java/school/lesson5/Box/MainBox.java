package school.lesson5.Box;

public class MainBox {


    public static void main(String[] args) {
        Box<Apples> boxApples = new Box<>();
        Box<Oranges> boxOranges = new Box<>();


        Apples apple = new Apples(1f);
        Oranges orange = new Oranges(1.5f);



        boxApples.addFruit(apple,6);


        boxOranges.addFruit(orange,4);


        System.out.println(boxApples.getBoxWeight());
        System.out.println(boxOranges.getBoxWeight());

        System.out.println(boxApples.compare(boxOranges));
    }
}
