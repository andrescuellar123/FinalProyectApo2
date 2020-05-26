package model;

import java.util.ArrayList;

public class Client extends Human {
	private Client next;
	private Client prev;
	private ArrayList<Product> prod;
	private Double total;
	
	/**
	 * @param next
	 * @param prev
	 * @param prod
	 */
	public Client ( String name, String id,String phone,boolean emplo) {
		super( name,id,phone,emplo);
		this.next = next;
		this.prev = prev;
		total = 0.0 ;
		prod = new ArrayList<Product>();
	}
	/**
	 * @return the next
	 */
	public Client getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Client next) {
		this.next = next;
	}
	/**
	 * @return the prev
	 */
	public Client getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(Client prev) {
		this.prev = prev;
	}
	/**
	 * @return the prod
	 */
	public ArrayList<Product> getProd() {
		return prod;
	}
	/**
	 * @param prod the prod to set
	 */
	public void setProd(ArrayList<Product> prod) {
		this.prod = prod;
	}

	public void addProducto( Product p) {
		
		prod.add(p);
	}
	


	/**
	 * @return the total
	 */
	public Double getTotal() {
		total = all();
		if(total == 200000) {
			total = total - 20000;
		}
		
		return total;
	}
	
	
	public Double all() {
		double all=0;
		for (int i = 0; i < prod.size(); i++) {
			all+= prod.get(i).getCost();
		}
		if(all == 200000) {
			all = all - 20000;
		}
		return all;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	
}

	
	

	



