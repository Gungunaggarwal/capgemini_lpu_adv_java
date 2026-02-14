package com.practice;

public class Main {
	public static void main(String[] args) {
		
	}

}

abstract class GoodsTransport {
	String transportId;
	String transportDate;
	int transportRating;
	public String getTransportId() {
		return transportId;
	}
	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}
	public String getTransportDate() {
		return transportDate;
	}
	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}
	public int getTransportRating() {
		return transportRating;
	}
	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}
	
	
	public GoodsTransport(String transportId, String transportDate, int transportRating){
		this.transportId=transportId;
		this.transportDate=transportDate;
		this.transportRating=transportRating;
		
	}
	
	
	abstract public String vehicleSelection();
	abstract public float calculateTotalCharge();
	
	
	
	
}
class BrickTransport extends GoodsTransport{
	float brickSize;
	int brickQuantity;
	float brickPrice;
	public float getBrickSize() {
		return brickSize;
	}
	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	public int getBrickQuantity() {
		return brickQuantity;
	}
	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	public float getBrickPrice() {
		return brickPrice;
	}
	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	
	public BrickTransport(String transportId, String transportDate, int transportRating, float brickSize, int brickQuantity, float brickPrice ) {
		super(transportId, transportDate, transportRating);
		this.brickSize=brickSize;
		this.brickQuantity=brickQuantity;
		this.brickPrice=brickPrice;
	}
	
	public String vehicleSelection() {
		if(brickQuantity<300) {
			return "Truck";
		}
		else if(brickQuantity>300 && brickQuantity<500) {
			return "Lorry";
		}
		else {
			return "MonsterLorry";
		}
	}
	
	public float calculateTotalCharge() {
		float Price = brickPrice * brickQuantity;
		float Tax = Price * 0.3f;
		 
		float Discount =0;
		
		
		
	}
	
}
