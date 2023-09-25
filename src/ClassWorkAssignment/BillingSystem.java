package ClassWorkAssignment;


import java.util.Scanner;
import java.util.HashMap;

    public class BillingSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of items: ");
            int numItems = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            HashMap<String, Item> items = new HashMap<>();

            for (int i = 0; i < numItems; i++) {
                System.out.println("Enter details for item " + (i+1) + ":");

                System.out.print("Item name: ");
                String name = scanner.nextLine();

                System.out.print("Item price: ");
                double price = scanner.nextDouble();

                System.out.print("Item quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                items.put(name, new Item(name, price, quantity));
            }

            double total = items.values().stream().mapToDouble(i -> i.price * i.quantity).sum();
            double vat = 0.1 * total;
            double discount = 0.1 * total;
            double finalTotal = total + vat - discount;

            System.out.println("\n--- BILL ---");
            System.out.printf("%-15s%-10s%-10s%-15s\n", "Item", "Price", "Quantity", "Sub-Total");
            System.out.println("--------------------------------------------------");

            for (Item item : items.values()) {
                System.out.printf("%-15s$%-10.2f%-10d$%-15.2f\n", item.name, item.price, item.quantity, item.price * item.quantity);
            }

            System.out.printf("\nTotal: $%.2f\n", total);
            System.out.printf("VAT (10%%): $%.2f\n", vat);
            System.out.printf("Discount (10%%): -$%.2f\n", discount);
            System.out.printf("Final Total: $%.2f\n", finalTotal);
        }
    }

    class Item {
        String name;
        double price;
        int quantity;

        Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }






