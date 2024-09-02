public class Item {
    private static int totalItemsSold = 0;
    private static double totalRevenue = 0.0;

    private double price;

    public Item(double price) {
        this.price = price;
    }

    public void sell(int quantity) {
        totalItemsSold += quantity;
        totalRevenue += quantity * price;
    }

    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static void main(String[] args) {
        
        Item laptop = new Item(1000.0);
        laptop.sell(2);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());  
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        Item smartphone = new Item(500.0);
        smartphone.sell(5);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());  
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());  

        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());  
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());  
        
        Item mixedLaptop = new Item(1000.0);
        Item mixedSmartphone = new Item(500.0);
        mixedLaptop.sell(1);
        mixedSmartphone.sell(4);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        Item largeLaptop = new Item(1000.0);
        largeLaptop.sell(100);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold()); 
        System.out.println("Total Revenue: $" + Item.getTotalRevenue()); 
    }
}
