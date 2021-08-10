package school.lesson4.task6;

public class Purchase {
    private final String nameShop;
    private final String nameCustomer;
    private Product product;
    private double totalPurchase = 0;
    private final Product[] products = new Product[10];

    public Purchase(String nameCustomer, String nameShop) {
        this.nameShop = nameShop;
        this.nameCustomer = nameCustomer;
    }

    private class Product {
        private String name;
        private double price;
        private int amount;
        private static int index = 0;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }

        public void addToCart() {
            products[index] = product;
            index++;
            totalPurchase += price * amount;
        }
    }


    public String getNameShop() {
        return nameShop;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void generatePurchase(String name, int amount, double price) {
        product = new Product();
        product.setName(name);
        product.setAmount(amount);
        product.setPrice(price);
        product.addToCart();
    }

    public void info() {
        System.out.println("The Customer " + getNameCustomer() + " in the store  " + getNameShop() + " made the purchase of the following :  ");
        for (Product product : products) {
            if (product != null) {
                System.out.println("\t" + product.getName() + " in amount of "
                        + product.getAmount() + " - price per 1 "
                        + product.getPrice());

            }
        }
    }
}