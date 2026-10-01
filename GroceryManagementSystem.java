import java.util.Scanner;

/**
 * Grocery management system that stores grocery item information
 * using parallel arrays.
 *
 * <p>The program allows the user to view the current inventory,
 * restock an existing grocery item, and exit the program.
 * The item name, price, and stock arrays use the same index
 * to represent the same grocery item.</p>
 *
 * @author LaPree Habbit
 * @author Aayusha Adhikari
 * @author Zigme Tanzing Lama
 * @author Ryan Vollbrecht
 * @author Ankur Basnet
 * @version 1.0
 */
public class GroceryManagementSystem {

    /**
     * Private constructor so no objects of this class are created.
     * All methods in this class are static.
     */
    private GroceryManagementSystem() {
    }

    /**
     * Runs the Grocery Management System.
     *
     * <p>This method creates the parallel arrays, adds the starting
     * grocery inventory, and displays a menu that allows the user
     * to view inventory, restock an item, or exit the program.</p>
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Starting grocery inventory
        itemNames[0] = "Apples";
        itemPrices[0] = 1.99;
        itemStocks[0] = 15;

        itemNames[1] = "Milk";
        itemPrices[1] = 3.49;
        itemStocks[1] = 8;

        itemNames[2] = "Bread";
        itemPrices[2] = 2.79;
        itemStocks[2] = 12;

        while (true) {

            System.out.println("\n--------- Grocery Management System ---------");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Please enter 1, 2, or 3: ");
                input.nextLine();
            } 

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } 
            else if (choice == 2) {

                System.out.print("Enter item name: ");
                String target = input.nextLine();

                System.out.print("Enter amount to restock: ");
                while (!input.hasNextInt()) {
                    System.out.print("Invalid input. Please enter a whole number: ");
                    input.nextLine();
                }

                int amount = input.nextInt();
                input.nextLine();

                restockItem(itemNames, itemStocks, target, amount);

            }
            else if (choice == 3) {
                System.out.println("Exiting Grocery Management System.");
                break;
            }
            else {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
        input.close();
    }
    /**
     * Displays all grocery items currently stored in the inventory.
     *
     * <p>The method loops through the parallel arrays and only
     * displays array positions that contain an item name.
     * Empty inventory positions are skipped.</p>
     *
     * @param names the array containing grocery item names
     * @param prices the array containing grocery item prices
     * @param stocks the array containing the stock amount for each item
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks){

        System.out.println("--------- Grocery Inventory ---------");

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(
                        "Item: " + names[i]
                        + " | Price: $" + prices[i]
                        + " | Stock: " + stocks[i]);
            }
            else {
                // Empty inventory slot, so nothing is displayed
            }
        }
    }

    /**
     * Restocks an existing grocery item by adding the specified
     * amount to its current stock.
     *
     * <p>The method searches the names array for the requested item.
     * If the item is found, the amount is added to the matching
     * position in the stocks array. If the item is not found,
     * "Item not found." is displayed.</p>
     *
     * @param names the array containing grocery item names
     * @param stocks the array containing the stock amount for each item
     * @param target the name of the grocery item to search for
     * @param amount the amount to add to the item's current stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null 
                && names[i].equalsIgnoreCase(target)) {
                
                    stocks[i] = stocks[i] + amount;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }
}
