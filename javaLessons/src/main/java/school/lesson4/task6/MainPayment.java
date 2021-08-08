package school.lesson4.task6;


public class MainPayment {
    public static void main(String[] args) {
        // В данном случае мы из уже созданных экземпляров выбирает что и сколько купить
        Payment pay1 = new Payment();
        pay1.t1.buy();
        pay1.sm1.buy("ASD", 5);

        // В данном случае мы за создаем экземпляр и именно его и покупаем в нужном количестве
        Payment.TV pay2 = new Payment().new TV();
        pay2.buy(2);
    }
}

