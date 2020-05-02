package model;



public class ShopProgram {

	private Employee empleadoRaiz;
	private Client first;
	/**
	 * @param empleadoRaiz
	 * @param first
	 */
	public ShopProgram() {
		Employee empleadoRaiz = new Employee(null, null, true);
		this.first = first;
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


	//	public void insertar(String name , String id) {
	//		if (empleadoRaiz == null) {
	//			Employee nuevo = new Employee(name , id ,true);
	//			nuevo.setDer(new ShopProgram());
	//			nuevo.setIzq(new ShopProgram());
	//			empleadoRaiz = nuevo;
	//		} else {
	//			if (a > raiz.getDato()) {
	//				(raiz.getDer()).insertar(a);
	//			}
	//			if (a < raiz.getDato()) {
	//				(raiz.getIzq()).insertar(a);
	//			}
	//		}
	//	}

	/**
	 * @return the empleadoRaiz
	 */
	public Employee getEmpleadoRaiz() {
		return empleadoRaiz;
	}

	/**
	 * @param empleadoRaiz the empleadoRaiz to set
	 */
	public void setEmpleadoRaiz(Employee empleadoRaiz) {
		this.empleadoRaiz = empleadoRaiz;
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


//	public boolean addClient(String name , String id) {
//		boolean add=false;
//		if(first == null) {
//			first= new Client(name,id,false);
//			add=true;
//		}
//		else {
//			Client temp = first;
//			while(temp.getNext() != null) {
//				temp = temp.getNext();
//			}
//			temp.setNext(new Client (name,id,false ));
//			add= true;
//		}
//		return add;
//	}
	


	public String ShowClients() {
		String msg = "";
		if(first != null) {
			Client act = first;
			while(act != null) {
				System.out.println( act.getId() + " "+act.getName()) ;
				msg = act.getId() + act.getName();
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
}
