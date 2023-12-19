package tradearea.warehouse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;

import tradearea.model.ProductData;
import tradearea.model.WarehouseData;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WarehouseController {

    @Autowired
    private WarehouseService service;
	
    @RequestMapping("/")
    public String warehouseMain() {
    	String mainPage = "This is the warehouse application! (DEZSYS_WAREHOUSE_REST) <br/><br/>" +
                          "<a href='http://localhost:8080/warehouse/001/data'>Link to warehouse/001/data</a><br/>" +
                          "<a href='http://localhost:8080/warehouse/001/xml'>Link to warehouse/001/xml</a><br/>" +
                          "<a href='http://localhost:8080/warehouse/001/consumer'>Link to warehouse/001/consumer</a><br/>";
        return mainPage;
    }

    @RequestMapping(value="/warehouse/{inID}/data", produces = MediaType.APPLICATION_JSON_VALUE)
    public WarehouseData warehouseData( @PathVariable int inID ) {
        WarehouseData warehouseData = service.getWarehouseData(inID);

        ProductData p1 = service.getProductData(1);
        ProductData p2 = service.getProductData(2);
        ProductData p3 = service.getProductData(3);

        List<ProductData> products = new ArrayList<>();

        products.add(p1);
        products.add(p2);
        products.add(p3);

        warehouseData.setProductData(products);

        return warehouseData;
    }

    @RequestMapping(value="/warehouse/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public WarehouseData warehouseDataXML(@PathVariable int inID) {
        WarehouseData warehouseData = service.getWarehouseData(inID);

        ProductData p1 = service.getProductData(1);
        ProductData p2 = service.getProductData(2);
        ProductData p3 = service.getProductData(3);

        List<ProductData> products = new ArrayList<>();

        products.add(p1);
        products.add(p2);
        products.add(p3);

        warehouseData.setProductData(products);

        return warehouseData;
    }
}