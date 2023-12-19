package tradearea.product;

import tradearea.model.ProductData;

import java.util.Date;

public class ProductSimulation {

    private ProductData product;

    String[] names = new String[] {
            "Schraubenzieher", "Schokolade-Eis", "T-Shirt mit blauem Muster", "Nerf-Blaster", "Iphone 13 Pro Max"
    };
    String[] categories = new String[] {
            "Elektronik", "Lebensmittel", "Haushaltswaren", "Kleidung", "Spielzeug"
    };
    double[] prices = new double[] {
            19.99, 3.49, 15.95, 494.90, 2422.99
    };
    int[] stocks = new int[] {
            50, 200, 75, 40, 150
    };
    boolean[] availabilities = new boolean[] {
            true, false, true, true, false
    };

    int[] expiryDates = new int[] {
            2024, 1998, 2006, 2027, 2033
    };

    private double getRandomDouble() {
        double number = Math.random() * 4;
        return Math.round(number * 100.0) / 100.0;
    }

    private int getRandomInt() {
        return (int) Math.round(Math.random() * 4);
    }

    public ProductData generateData(int ID) {
        this.product = new ProductData(ID, this.names[this.getRandomInt()], this.categories[this.getRandomInt()], this.prices[this.getRandomInt()], this.stocks[this.getRandomInt()], this.expiryDates[this.getRandomInt()], this.availabilities[this.getRandomInt()]);
        return this.product;
    }
}
