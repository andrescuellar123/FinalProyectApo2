package model;

public class Employee {
	private Human raiz;
	private int size;
	/**
	 * @param raiz
	 * @param size
	 */
	public Employee(Human raiz, int size) {
		super();
		this.raiz = raiz;
		this.size = size;
	}
	/**
	 * @return the raiz
	 */
	public Human getRaiz() {
		return raiz;
	}
	/**
	 * @param raiz the raiz to set
	 */
	public void setRaiz(Human raiz) {
		this.raiz = raiz;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
