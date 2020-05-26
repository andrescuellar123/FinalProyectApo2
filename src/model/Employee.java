package model;

import java.util.ArrayList;



public class Employee extends Human{
	
	private Employee der;
	private Employee izq;
	private ArrayList<Client>clients;
	private int numClients;
	
	/**
	 * @param raiz
	 * @param size
	 */
	
	public Employee( String name, String id,String phone,boolean employee) {
		super(name,id,phone,employee);
		  der = null;
	      izq = null;
	      numClients=0;
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

//	@Override
//	public int compareTo(Employee em) {
//		int substraction = 0;
//		double x = this.getId().compareTo(em.getId());
//		if(x > 0) {
//			substraction = 1;
//		}else if(x < 0) {
//			substraction = -1;
//		}
//		return substraction;
//	}
	
	
	public void addClient(String name, String id,String phone) {
		Client c = new Client (name, id,phone,false);
		clients.add(c);
	}
	

	public String inOrder(Employee node) {
	    String returnString = "";
	    if (node != null) {
	        returnString += inOrder(node.getIzq());
	        returnString += node.getName();
	        returnString += inOrder(node.getDer())+" ";
	        
	    }
	    return returnString;
	}

	public String posOrder(Employee node) {
	    String returnString = "";
	    if (node != null) {
	        returnString += posOrder(node.getIzq());
	        returnString += posOrder(node.getDer())+" ";
	        returnString += node.getName();
	    }
	  
	    return returnString;
	}
	
	public ArrayList<Employee> posOrder2(Employee node,ArrayList<Employee>arr) {
	    if (node != null) {
	        posOrder2(node.getIzq(),arr);
	        posOrder2(node.getDer(),arr);
	        arr.add( node);
	    }
	    return arr;
	}
	
	
	public String preOrder(Employee node) {
	    String returnString = "";
	    if (node != null) {
	    	returnString += node.getName();
	        returnString += preOrder(node.getIzq());
	        returnString += preOrder(node.getDer())+" ";
	        
	    }
	    return returnString;
	}
	
	public  ArrayList<Employee> preOrder2(Employee node,ArrayList<Employee>arr) {
		 if (node != null) {
			 	arr.add( node);
		        preOrder2(node.getIzq(),arr);
		        preOrder2(node.getDer(),arr);
		        
		    }
		    return arr;
	}
	public  ArrayList<Employee> inOrder2(Employee node,ArrayList<Employee>arr) {
		 if (node != null) {
			 	
		        preOrder2(node.getIzq(),arr);
		        arr.add( node);
		        preOrder2(node.getDer(),arr);
		        
		    }
		    return arr;
	}
	/**
	 * @return the numClients
	 */
	public int getNumClients() {
		numClients = num();
		return numClients;
	}

	
	public int num() {
		int cosa=0;
		for (int i = 0; i < clients.size(); i++) {
			cosa++;
		}
		return cosa;
	}
	/**
	 * @param numClients the numClients to set
	 */
	public void setNumClients(int numClients) {
		this.numClients = numClients;
	}
	

	
	

	
}
