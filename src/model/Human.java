package model;

public class Human implements Comparable<Human>{
	protected String name;
	protected boolean empleado;
	protected String id;
	protected String phone;
	private Human next;
	/**
	 * @param name
	 * @param empleado
	 * @param id
	 * @param left
	 * @param right
	 * @param next
	 */
	public Human(String name, String id,String phone,boolean empleado) {
		super();
		this.name = name;
		this.phone = phone;
		this.empleado = empleado;
		this.id = id;
		this.next = null;
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
	

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int compareTo(Employee em) {
		return em.getId().compareTo(id) ;
	}
	


	public int compare(Human o1, Human o2) {
		int substraction = 0;
		double x = o1.getId().compareTo(o2.getId());
		if(x > 0) {
			substraction = 1;
		}else if(x < 0) {
			substraction = -1;
		}
		return substraction;
	}
	
	@Override
	public int compareTo(Human o) {
		return o.getId().compareTo(id) ;
	}
	
}
