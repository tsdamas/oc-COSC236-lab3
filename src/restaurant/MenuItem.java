package restaurant;
// MenuItem class
public class MenuItem {
    private String name;
    //changed price to priceInDollars
    private double priceInDollars;

    public MenuItem(String name, double price) {
        this.name = name;
        this.priceInDollars = price;
    }

    public String getName() {
        return name;
    }

    public double getPriceInDollars() {
    	// changed return of price to priceInDollars
        return priceInDollars;
    }
}
