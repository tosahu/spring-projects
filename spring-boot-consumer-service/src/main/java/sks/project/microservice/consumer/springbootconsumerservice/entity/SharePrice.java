package sks.project.microservice.consumer.springbootconsumerservice.entity;

public class SharePrice {
	
	private String companyName;
	private Double price;
	private int port;
	private double totalSharePrice;

	public SharePrice() {
		
	}
	public SharePrice(String companyName, Double price, int port, double totalSharePrice) {
		super();
		this.companyName = companyName;
		this.price = price;
		this.port = port;
		this.totalSharePrice = totalSharePrice;
	}

	
	public double getTotalSharePrice() {
		return totalSharePrice;
	}

	public void setTotalSharePrice(double totalSharePrice) {
		this.totalSharePrice = totalSharePrice;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
