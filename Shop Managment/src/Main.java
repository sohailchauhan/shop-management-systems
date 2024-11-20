public class Main {
    public static void main(String[] args) {
        Shop myShop = new Shop();

        // Add products
        myShop.addProduct("Laptop", 999.99, 10);
        myShop.addProduct("Smartphone", 599.99, 20);
        myShop.addProduct("Headphones", 199.99, 15);

        // Display all products
        myShop.displayProducts();

        // Edit a product
        myShop.editProduct("Laptop", "Gaming Laptop", 1499.99, 8);

        // Display all products after edit
        myShop.displayProducts();

        // Remove a product
        myShop.removeProduct("Smartphone");

        // Display all products after removal
        myShop.displayProducts();

        // Delete a product
        myShop.deleteProduct("Headphones");

        // Display all products after deletion
        myShop.displayProducts();
    }
}
