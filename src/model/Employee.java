package model;

import java.util.ArrayList;

public class Employee extends Human{
	private Human raiz;
	private Employee der;
	private Employee izq;
	private ArrayList<Client>clients;
	
	/**
	 * @param raiz
	 * @param size
	 */
	public Employee( String name, String id,boolean employee) {
		super(name,id,employee);
		  der = null;
	      izq = null;
		clients = new ArrayList<Client>();
	}
	
	/**
	 * @return the der
	 */
	public Employee getDer() {
		return der;
	}

	/**
	 * @param der the der to set
	 */
	public void setDer(Employee der) {
		this.der = der;
	}

	/**
	 * @return the izq
	 */
	public Employee getIzq() {
		return izq;
	}

	/**
	 * @param izq the izq to set
	 */
	public void setIzq(Employee izq) {
		this.izq = izq;
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
	 * @return the clients
	 */
	public ArrayList<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	@Override
	public int compareTo(Employee em) {
		int substraction = 0;
		double x = this.getId().compareTo(em.getId());
		if(x > 0) {
			substraction = 1;
		}else if(x < 0) {
			substraction = -1;
		}
		return substraction;
	}
	


//	public void addEmploy(Employee em) throws RepetitiveException {
//		if(compareTo(em)==0) {
//			throw new RepetitiveException("Este empleado ya existe!");
//		}else if(compareTo(em)>0) {
//			if(izq==null) {
//				izq = em;
//			}else {
//				izq.addEmploy(em);
//			}
//		}else {
//			if(der==null) {
//				der = em;
//			}else {
//				der.addEmploy(em);
//			}
//		}
//	}
	
	
	public void addClient(String name, String id) {
		Client c = new Client (name, id,false);
		clients.add(c);
	}
	


	
	
	
}
