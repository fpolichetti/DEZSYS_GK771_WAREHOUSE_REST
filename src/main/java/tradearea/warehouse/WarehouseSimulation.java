package tradearea.warehouse;

import tradearea.model.WarehouseData;

public class WarehouseSimulation  {

	private WarehouseData warehouse;

	String[] names = new String[] {
		"Zentrallager", "Lager-Ost", "Lager-West", "Lager-Süd", "Lager-Nord"
	};
	String[] locations = new String[] {
			"Wien", "Linz", "Salzburg", "Bregenz", "Eisenstadt"
	};
	int[] Storage = new int[] {
			2203, 3039, 94442, 2942, 9920
	};
	int[] parking = new int[] {
			23, 293, 985, 8, 192
	};
	boolean[] avaibility = new boolean[] {
			true, true, false, false, true
	};


	private double getRandomDouble() {
		double number = ( Math.random() * ( (4-0) + 0 )) + 0;
		double rounded = Math.round(number * 100.0) / 100.0;
		return rounded;

	}

	private int getRandomInt() {
		double number = ( Math.random() * ( (0-4) + 0 )) + 4;
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}

	public WarehouseData generateData(int ID) {
		this.warehouse = new WarehouseData(ID,this.names[this.getRandomInt()],this.locations[this.getRandomInt()],this.Storage[this.getRandomInt()],this.parking[this.getRandomInt()],this.avaibility[this.getRandomInt()]);
		return this.warehouse;
	}


}
