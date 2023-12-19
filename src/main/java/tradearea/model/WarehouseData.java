package tradearea.model;

import tradearea.warehouse.WarehouseSimulation;

import javax.xml.bind.annotation.XmlElement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseData  {
	
	private int warehouseID = 1;
	private String warehouseName;
	private String warehouseLocation;
	private int warehouseStorage;
	private int warehouseParkingSlots;
	private boolean warehouseAvaibility;
	private List<ProductData> productData = new ArrayList<>();


	public WarehouseData(int warehouseID, String warehouseName, String warehouseLocation, int warehouseStorage, int warehouseParkingSlots, boolean warehouseAvaibility) {
		this.warehouseID = warehouseID;
		this.warehouseName = warehouseName;
		this.warehouseLocation = warehouseLocation;
		this.warehouseStorage = warehouseStorage;
		this.warehouseParkingSlots = warehouseParkingSlots;
		this.warehouseAvaibility = warehouseAvaibility;
	}

	@XmlElement(name = "productData")
	public List<ProductData> getProductData() {
		return productData;
	}

	public void setProductData(List<ProductData> productData) {
		this.productData = productData;
	}

	public String getWarehouseLocation() {
		return warehouseLocation;
	}

	public void setWarehouseLocation(String warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}

	public int getWarehouseStorage() {
		return warehouseStorage;
	}

	public void setWarehouseStorage(int warehouseStorage) {
		this.warehouseStorage = warehouseStorage;
	}

	public int getWarehouseParkingSlots() {
		return warehouseParkingSlots;
	}

	public void setWarehouseParkingSlots(int warehouseParkingSlots) {
		this.warehouseParkingSlots = warehouseParkingSlots;
	}

	public boolean isWarehouseAvaibility() {
		return warehouseAvaibility;
	}

	public void setWarehouseAvaibility(boolean warehouseAvaibility) {
		this.warehouseAvaibility = warehouseAvaibility;
	}

	/**
	 * Setter and Getter Methods
	 */
	public int getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(int warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Warehouse Info: ID = %s, timestamp = %s", warehouseID );
		return info;
	}
}
