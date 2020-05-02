package model;

import java.util.ArrayList;

public class Client extends Human {
	private Client next;
	private Client prev;
	private ArrayList<Product> prod;
	/**
	 * @param next
	 * @param prev
	 * @param prod
	 */
	public Client (Client next, Client prev, String id, String name,boolean emplo) {
		super(id, name,emplo);
		this.next = next;
		this.prev = prev;
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

	public void addProducto( Product p ) {
		prod.add(p);
	}



}
