package model;

public class Product {
	private String name;
	private double cost;

	/**
	 * @param name
	 * @param cost
	 */
	public Product(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	/**
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "name=" + name + ", cost=" + cost;
	}
	
	
}
