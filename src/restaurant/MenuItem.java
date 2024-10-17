package restaurant;
// MenuItem class
public class MenuItem {
    private String name;
    //changed price to priceInDollars
    private double priceInDollars;

    public MenuItem(String name, double priceInDollars) {
        this.name = name;
        //changed price to priceInDollars
        this.priceInDollars = priceInDollars;
    }

    public String getName() {
        return name;
    }

    public double getPriceInDollars() {
    	// changed return of price to priceInDollars
        return priceInDollars;
    }
}
