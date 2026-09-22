public class GroceryManagementSystem {

    public static void restockItem(String[] names, int[] stocks,
                                   String target, int amount) {

        boolean found = false;

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
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