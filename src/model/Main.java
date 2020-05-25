package model;

public class Main {

	public static void main(String[] args) throws RepetitiveException {
		
		ShopProgram sh = new ShopProgram();
		String s ="Pepe";
		String d = "1234";
		String l ="fefe";
		String p = "3308206";
		String m = "222";
		String l1 ="paco";
		String l12 ="pac";
		String m1 = "111";
	
		sh.addHumanTree(s, d,p);
		sh.addHumanTree(l, m,p);
		sh.addHumanTree(l12, p,s);
		sh.addHumanTree(l1, m1,p);
		
		//sh.posOrder(sh.getEmpleadoRaiz());
//		System.out.println( sh.inOrder(sh.getEmpleadoRaiz()));
		
		//sh.preOrder(sh.getEmpleadoRaiz());
//		System.out.println(sh.inOrderName(sh.getEmpleadoRaiz()));
		System.out.println("\n");
		//System.out.println(sh.preOrderN(sh.getEmpleadoRaiz()));
		System.out.println("\n");
		//System.out.println(sh.posOrder(sh.getEmpleadoRaiz() ));
//		System.out.println(sh.posOrderName(sh.getEmpleadoRaiz()));
		
		
//		sh.addCliente(s, d,p);
//		sh.addCliente(l1, m,p);
//		System.out.println(sh.ShowClients());
		
		sh.getNa2(sh.getEmpleadoRaiz());
		
	
		
	}

}
