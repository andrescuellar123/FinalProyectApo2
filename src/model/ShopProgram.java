package model;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ShopProgram {

	private Employee empleadoRaiz;
	private Client first;
	private ArrayList<Client> na ;
	private ArrayList<String> na2 ;
	private ArrayList<String> id ;
	/**
	 * @param empleadoRaiz
	 * @param first
	 */
	public ShopProgram() {
		Employee empleadoRaiz = new Employee(null, null, true);
		this.first = first;
		na = new ArrayList<Client>();
		id = new ArrayList<String>();
	}

	public String getNameEmployee() {
		return empleadoRaiz.getName();
	}

	public String getIdEmployee() {
		return empleadoRaiz.getId();
	}

	public Boolean getEmpl() {
		return empleadoRaiz.isEmpleado();
	}




	
	/**
	 * @return the empleadoRaiz
	 */
	public Employee getEmpleadoRaiz() {
		return empleadoRaiz;
	}

	/**
	 * @return the na2
	 */
	public ArrayList<String> getNa2() {
		if(first != null) {
			Client act = first;
			String msg="";
			while(act != null){
				msg=act.getName();
				na2.add(msg);
				act = act.getNext();
				
			}
			
		}
		return na2;
	}

	/**
	 * @param na2 the na2 to set
	 */
	public void setNa2(ArrayList<String> na2) {
		this.na2 = na2;
	}

	/**
	 * @param empleadoRaiz the empleadoRaiz to set
	 */
	public void setEmpleadoRaiz(Employee empleadoRaiz) {
		this.empleadoRaiz = empleadoRaiz;
	}
	



	/**
	 * @return the na
	 */
	public ArrayList<Client> getNa() {
		if(first != null) {
			Client act = first;
			while(act != null){
				na.add(act);
				act = act.getNext();
				
			}
			
		}
		return na;
	}

	/**
	 * @param na the na to set
	 */
	public void setNa(ArrayList<Client> na) {
		this.na = na;
	}

	/**
	 * @return the id
	 */
	public ArrayList<String> getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ArrayList<String> id) {
		this.id = id;
	}

	public void addHumanTree(String name , String id) {
		Employee nuevo = new Employee(name,id,true);
		if(empleadoRaiz == null) {
			empleadoRaiz = nuevo;
		}
		else {
			Human aux = empleadoRaiz;
			Human padre;
			while(true) {
				padre = aux;
				if( nuevo.compare(nuevo, aux)== -1) {
					aux = aux.getLeft();
					if(aux == null) {
						padre.setLeft(nuevo);
						return;
					}
				}else {
					aux = aux.getRight();
					if(aux== null) {
						padre.setRight(nuevo);
						return;
					}
				}
			}
		}
	}

	public void inOrder(Employee raiz) {
		if (raiz != null) {
			inOrder(raiz.getIzq());
			System.out.println(raiz.getId()+" " + raiz.getName());
			inOrder(raiz.getDer());
		}
	}



	//Clientes


	public boolean addCliente(String name , String id) throws RepetitiveException {
		Client c = new Client(name,id,false);
		boolean added = false;
		Client actual = first;
		if(actual == null) {
			added = true;
			first = c;
			first.setNext(null);
			first.setPrev(null);
		}else if(!sameCliente(c)) {
			while(actual!=null && !added) {
				if(actual.getNext()==null) {
					actual.setNext(c);
					actual.getNext().setPrev(actual);
					added = true;
				}
				actual = actual.getNext();
			}
		}else {
			throw new RepetitiveException("El cliente ya existe!"); 
		}
		return added;
	}

	public boolean sameCliente(Client c) {
		boolean same = false;
		Client actual = first;
		while(actual != null && !same) {
			if(actual.compareTo(c)==0) {
				same = true;
			}
			actual = actual.getNext();
		}
		return same;
	}


	



	public String ShowClients() {
		String msg = "";
		if(first != null) {
			Client act = first;
			while(act != null) {
				
				msg +=  act.getName()+" ";
				
				act = act.getNext();

			} 

		}
		return msg;
	}
	public String ShowClients2() {
		String msg = "";
		if(first != null) {
			Client act = first;
			while(act != null) {
				
				msg +=  act.getId()+" ";
				
				act = act.getNext();

			} 

		}
		return msg;
	}

	public Client findClient(String id) {
		Client e = null;
		Client actual = first;
		boolean finded = false;
		while(actual != null && !finded) {
			if(actual.getId().equals(id)) {
				e = actual;
				finded = true;
			}
			actual = actual.getNext();
		}
		return e;
	}

	public void addProduct(String name, double cost, String id) {
		Product p = new Product(name,cost);
		findClient(id).addProducto(p);
	}


	public String[] names (){
		String[] ar = ShowClients().split(" ");
		return ar;
		
	}
	public String[] ids() {
		String[] ar = ShowClients2().split(" ");
		return ar;
	}




}
