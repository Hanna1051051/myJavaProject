package school.lesson5;

public class Arr <T> {
    private T[] nums;
    private int a;
    private int b;


    public Arr(T... nums) {
        this.nums = nums;


    }

    public void arrChange(int a, int b) {
        T c = nums[a];
        nums[a] = nums[b];
        nums[b] = c;



        for (T x : nums) {
            System.out.print(x + " ");

        }

        System.out.println();
    }

}