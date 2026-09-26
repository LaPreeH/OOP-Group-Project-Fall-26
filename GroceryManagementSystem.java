/**
 * Grocery management system that manages grocery items
 * using parallel arrays.
 */
public class GroceryManagementSystem {

    /**
     * Restocks an existing grocery item by adding the given amount
     * to its current stock. If the item is not found, a message is displayed.
     *
     * @param names the array containing the grocery item names
     * @param stocks the array containing the stock amount for each item
     * @param target the name of the item to restock
     * @param amount the amount to add to the current stock
     */
    public static void restockItem(String[] names, int[] stocks,
                                   String target, int amount) {

        boolean found = false;

        // Search through the item names to find the requested item.
        for (int i = 0; i < names.length; i++) {

            // Make sure the array position is not empty before comparing names.
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {

                // Update the stock at the same index as the item name.
                stocks[i] = stocks[i] + amount;

                found = true;
                break;
            }
        }

        // Print this only after the whole list has been searched.
        if (!found) {
            System.out.println("Item not found.");
        }
    }
}