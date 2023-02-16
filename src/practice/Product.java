package practice;

public class Product {
    private String name;

    private int priceInCents;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceInCents=" + priceInCents +
                '}';
    }

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public static double findAveragePrice(Product[] product){
        double sum = 0;
        for(int i=0; i < product.length; i++) {
            sum += product[i].getPriceInCents();
        }
        return sum / product.length;
    }

    public static void main(String[] args) {

        Product p1 = new Product("toy", 50);
        Product p2 = new Product("bear", 100);
        Product p3 = new Product("candy", 100);
        Product p4 = new Product("bread", 200);

        Product[] product = new Product[4];

        product[0] = p1;
        product[1] = p2;
        product[2] = p3;
        product[3] = p4;

        System.out.println(Product.findAveragePrice(product));

//        System.out.println(product[0]);
    }
}
