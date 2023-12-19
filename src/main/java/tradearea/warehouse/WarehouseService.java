package tradearea.warehouse;

import org.springframework.stereotype.Service;
import tradearea.model.ProductData;
import tradearea.model.WarehouseData;
import tradearea.product.ProductSimulation;

@Service
public class WarehouseService {
	
	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }

    public WarehouseData getWarehouseData( int inID ) {

    	WarehouseSimulation simulation = new WarehouseSimulation();
        return simulation.generateData( inID );

    }

    public ProductData getProductData(int inID) {

        ProductSimulation simulation = new ProductSimulation();
        return simulation.generateData(inID);

    }
}