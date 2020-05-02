package model;

import java.util.ArrayList;

public class test  {
	
	public static void main(String[] args) throws RepetitiveException {
		Client first= new Client("wqe","ewq",false);
		ShopProgram sh = new ShopProgram();
		sh.addHumanTree("erwe", "asdasa");
		sh.addHumanTree("ewq", "qw");

		
		
//		sh.addNodeBegining("pepe","22");
//		sh.addNodeBegining("lala","111");
		sh.addCliente("lala","111");
		sh.addCliente("weq","223");
		sh.addCliente("ds","221");
		sh.addCliente("dfgf","222");
		sh.addCliente("xxxx","2222");
		
		System.out.println(sh.findClient("2222").getPrev().getName());
		
		sh.ShowClients();
		
	}

}
