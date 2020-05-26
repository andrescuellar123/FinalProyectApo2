package model;

import java.io.IOException;
import java.util.ArrayList;

public class test {
	
	public static void main(String[] args) throws RepetitiveException, IOException, ClientNullException, EmployeeNullException {
		
		ShopProgram sh = new ShopProgram();
		sh.addCliente("weqe", "2","22222");
		sh.addCliente("w", "1","22222");
		sh.addCliente("qwe", "3","33333");
	
//		sh.addCliente("weqe", "3","22222");
//		sh.addCliente("weqe", "1","22222");
//		sh.addCliente("weqe", "4","22222");
//		
//		System.out.println(sh.ShowClients());
		sh.addHumanTree("qwe", "9","33333");
		sh.addHumanTree("qwe", "10","33333");
		sh.addHumanTree("pepe", "7","22222");
		sh.addHumanTree("pipo1", "0","5555");
		sh.addHumanTree("pipo1", "1","5555");
//		sh.addHumanTree("pipo", "2","5555");

		System.out.println(sh.ShowClients2());
		System.out.println(sh.getEmpleadoRaiz().getId());
		sh.writteData();
		System.out.println("////////inordepocho////");
		System.out.println(sh.inOrderName(sh.getEmpleadoRaiz()));
//		
//		sh.addClientToEmployee("1", "2", "weqe", "22222");
//		sh.addClientToEmployee("2", "3", "weqe", "22222");
//		sh.addClientToEmployee("3", "4", "weqe", "22222");
//		sh.addClientToEmployee("3", "1", "qwe", "33333");
		
		//System.out.println(sh.inOrder(sh.getEmpleadoRaiz()));
		//System.out.println(sh.searchEmployee("2").getName());
//		ArrayList<Employee>emp = sh.getEmployeeList(sh.getEmpleadoRaiz());
//		for (int i = 0; i <= emp.size(); i++) {
//			System.out.println(emp.get(i).getName());
//		}
//		System.out.println(sh.getEmpleadoRaiz().getDer().getDer().getName());
//		System.out.println(sh.na2.size());
//		System.out.println(""+sh.getNa2(sh.getEmpleadoRaiz()).size());
//		System.out.println(sh.getNa2(sh.getEmpleadoRaiz()).get(0).getNumClients());
//		for (int i = 0; i < sh.na2.size(); i++) {
//			System.out.println(sh.na2.get(i).getName() +" na2");
//			System.out.println(sh.getNa2(sh.getEmpleadoRaiz()).get(i).getName() +" otro metodo");
//		}
//		System.out.println(sh.findClient("2").getName());
//		System.out.println(sh.findBinaryEmployee("0").getName());
//		System.out.println(sh.getNa2(sh.getEmpleadoRaiz()).get(2).getName());
		
	
//		System.out.println(sh.searchEmployee("0").getName());
	
	System.out.println("////////////////////////////////");
//	System.out.println(sh.inOrder(sh.getEmpleadoRaiz()));
//	System.out.println(sh.preOrder(sh.getEmpleadoRaiz()));
//	System.out.println(sh.getEmpleadoRaiz().inOrder());
//	String arr[] = sh.posOrder(sh.getEmpleadoRaiz()).split(" ");
//	for (int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]);
//	}
//	for (int i = 0; i < sh.getArrPosOrder().length; i++) {
//		System.out.println(sh.getArrPosOrder()[i]);
//	}
//	
//	System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
//	String msg="";
//	for (int i = 1; i < sh.getArrPosOrder().length; i++) {
//		
//		msg += i+"- " +sh.getArrPosOrder()[i]  +"\n";
//	}
//	System.out.println(msg);
//	for (int i = 0; i < sh.getPosOrder().size(); i++) {
//		System.out.println(sh.getPosOrder().get(i).getName()+i);
//	}
	for (int i = 0; i < sh.getInOrder().size(); i++) {
		System.out.println(sh.getInOrder().get(i).getName()+i);
	}
	
	System.out.println("////////PREORDER/////////");
	for (int i = 0; i < sh.getPreOrder().size(); i++) {
		System.out.println(sh.getPreOrder().get(i).getName()+i);
	}
	System.out.println("////////POSORDER/////////");
	for (int i = 0; i < sh.getPosOrder().size(); i++) {
		System.out.println(sh.getPosOrder().get(i).getName()+i);
	}
	
//	sh.inOrder(sh.getEmpleadoRaiz());
//	sh.sh2();
	
//	System.out.println(sh.findBinaryEmployee("2").getName());
		
//		System.out.println(sh.findingTheEmployeeOfTheMonth().getName());
//		System.out.println(sh.findBinaryClient("2").getName());
//		
//		System.out.println(sh.searchEmployee("1").getName());

	}

}
