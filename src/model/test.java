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
		//		sh.addCliente("lala","111");
		//		sh.addCliente("weq","223");
		//		sh.addCliente("ds","221");
		//		sh.addCliente("dfgf","222");
		//		sh.addCliente("xxxx","2222");
		//		
		//		System.out.println(sh.findClient("2222").getPrev().getName());
		//		
		//		sh.ShowClients();
		//		String name="swad";
		//		double cost = 2132;
		//		String id= "222";
		//		sh.addProduct(name, cost, id);
		//		System.out.println(sh.findClient(id).getProd());
		sh.addCliente("sa", "213");
		sh.addCliente("xxxx","2222");
		sh.addCliente("xxxx","3");
		sh.addCliente("xxxx","2");
		sh.addCliente("xxxx","1");
		//System.out.println(sh.ShowClients());
		sh.addProduct("weq", 2, "213");
		//System.out.println(sh.findClient("213").getProd().get(0).getName());


//		for (int i = 0; i < sh.names().length; i++) {
//			System.out.println(sh.names()[i].toString()  );
//		}
//
//		for (int i = 0; i < sh.ids().length; i++) {
//			System.out.println(sh.ids()[i].toString()  );
//		}
		
		//System.out.println(sh.getNa2());
		System.out.println(sh.getNa().toString());

	}



}
