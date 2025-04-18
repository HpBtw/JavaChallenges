package challenge6;

public class Product {
    public String name;
    public double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String checkRange(Product[] product, double min, double max) {
        String aux = "";

        for (int i = 0; i < product.length; i++) {
            if (product[i].cost <= max && product[i].cost >= min)
                aux += "\nProduct: " + product[i].name + "\nCost: " + product[i].cost + "\n";
        }

        return aux;
    }
}
