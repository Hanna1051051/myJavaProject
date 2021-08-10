package school.lesson4.task6;


public class

MainPayment {
    public static void main(String[] args) {
        // В данном случае мы из уже созданных экземпляров выбирает что и сколько купить
        Payment pay1 = new Payment();
        pay1.t1.buy();
        pay1.sm1.buy("ASD", 5);

        // В данном случае мы за создаем экземпляр и именно его и покупаем в нужном количестве
        Payment.TV pay2 = new Payment().new TV();
        pay2.buy(2);


        Purchase payment = new Purchase("Ivanov", "Sportmaster");
        payment.generatePurchase("suit", 1, 190);
        payment.generatePurchase("bag", 1, 15);
        payment.generatePurchase("T-shirt", 2, 3.15);
        payment.generatePurchase("sneakers", 1, 205);

        Purchase payment1 = new Purchase("Kotov", "Electrosila");

        payment1.generatePurchase("TV Samsung R15", 1, 1900);
        payment1.generatePurchase("battery set", 3, 4.50);
        payment1.generatePurchase("SmartWatch IP-158", 1, 285);

        payment1.info();
        payment.info();



    }
}

