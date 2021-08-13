package school.lesson5;

public class ArrChange {

    public static void main(String[] args) {
        Arr<Integer> arr1 = new Arr<>(1, 2, 3, 4, 5,6,7);
        arr1.arrChange(1, 6);

        Arr<String> arr2 = new Arr<>("cat", "dog", "fish", "bird", "chicken","elephant");
        arr2.arrChange(0,5);
    }
}
