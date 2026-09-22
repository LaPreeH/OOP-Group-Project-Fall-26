public class featureDisplay {

public static void printInventory(String[] names, double[] prices, int[] stocks){
    
    System.out.println("--------- Grocery Inventory ---------");
    
    for (int i = 0; i < names.length; i++){
        if (names[i] != null){
            System.out.println(
                "Item: " + names[i] + 
                " | Price: $" + prices[i] + 
                " | Stock: " + stocks[i]);
        }
        else {
            // Empty inventory slot, so nothing is displayed
        }
    }
}


    // Sample main to ensure that the funciton is working as intended
    public static void main(String[] args){
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Apples";
        itemPrices[0] = 1.99;
        itemStocks[0] = 15;

        itemNames[1] = "Milk";
        itemPrices[1] = 3.49;
        itemStocks[1] = 8;

        itemNames[2] = "Bread";
        itemPrices[2] = 2.79;
        itemStocks[2] = 12;

        printInventory(itemNames, itemPrices, itemStocks);
    }
}
