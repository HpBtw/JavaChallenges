package challenge6;

import java.util.Scanner;

// Scans a list(changeable size) of product names and prices, scans a min and max cost and return all items in this range

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insert the list size: ");
        int size = kb.nextInt();

        Product util = new Product("", 0);
        Product[] product = new Product[size];

        System.out.println("Starting product listing...");
        for (int i = 0; i < product.length; i++) {
            System.out.print("\nInsert product " + (i+1) + "'s name: ");
            String name = kb.next();
            System.out.print("Insert product " + (i+1) + "'s price: ");
            double price = kb.nextDouble();

            product[i] = new Product (name, price);
        }

        System.out.print("\nInsert the start of the range: ");
        double min = kb.nextDouble();

        System.out.print("Insert the ending of the range: ");
        double max = kb.nextDouble();

        System.out.println("\nList:" + util.checkRange(product, min, max));
    }
} //
