import java.util.Scanner;

public class Menu {

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

            } else if (choice == 2) {

                System.out.print("Enter item name: ");
                String target = input.nextLine();

                System.out.print("Enter amount to restock: ");
                int amount = input.nextInt();
                input.nextLine();

                restockItem(itemNames, itemStocks, target, amount);

            } else if (choice == 3) {

                System.out.println("Exiting Grocery Management System.");
                break;

            } else {

                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

        input.close();
    }
}
