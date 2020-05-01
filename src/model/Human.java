package model;

public class Human {
	protected String name;
	protected boolean empleado;
	protected String id;
	protected Human left;
	protected Human right;
	protected Human next;
	/**
	 * @param name
	 * @param empleado
	 * @param id
	 * @param left
	 * @param right
	 * @param next
	 */
	public Human(String name, String id,boolean empleado) {
		super();
		this.name = name;
		this.empleado = empleado;
		this.id = id;
		this.left = left;
		this.right = right;
		this.next = next;
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
	 * @return the empleado
	 */
	public boolean isEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(boolean empleado) {
		this.empleado = empleado;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the left
	 */
	public Human getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(Human left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public Human getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(Human right) {
		this.right = right;
	}
	/**
	 * @return the next
	 */
	public Human getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Human next) {
		this.next = next;
	}
	
	
	
	
}
