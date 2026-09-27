import java.util.Scanner;

public class GroceryManagementSystem {

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

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } 
            else if (choice == 2) {

                System.out.print("Enter item name: ");
                String target = input.nextLine();

                System.out.print("Enter amount to restock: ");
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
