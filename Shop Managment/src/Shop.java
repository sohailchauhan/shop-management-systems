import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> items;

    // Constructor
    public Shop() {
        items = new ArrayList<>();
    }

    // Add a product to the shop
    public void addProduct(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
        System.out.println("Product added: " + name);
    }

    // Remove a product from the shop by name
    public void removeProduct(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                items.remove(item);
                System.out.println("Product removed: " + name);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    // Edit a product's details (name, price, quantity) by name
    public void editProduct(String name, String newName, double newPrice, int newQuantity) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                item.setName(newName);
                item.setPrice(newPrice);
                item.setQuantity(newQuantity);
                System.out.println("Product edited: " + newName);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    // Delete a product completely from the shop by name
    public void deleteProduct(String name) {
        removeProduct(name);  // Can use the removeProduct method to delete
        System.out.println("Product deleted: " + name);
    }

    // Display all items in the shop
    public void displayProducts() {
        if (items.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Products in the shop:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}
