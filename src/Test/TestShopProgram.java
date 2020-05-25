package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.*
;class TestShopProgram {
	private ShopProgram sh;
	private Product p1;

	public void setup1() throws RepetitiveException {
		sh = new ShopProgram ();
		String name = "Pepe";
		String id = "123";
		String p = "22222";
		String name1 = "lolo";
		String id1 = "1234";
		String p1= "3333";
		sh.addCliente(name, id,p);
		sh.addCliente(name1, id1,p1);

		String name2 = "Carne";
		double cost = 12323;

		sh.addProduct(name2, cost, id);

		String name3 = "ChocoRamo";
		double cost2 = 200;

		sh.addProduct(name3, cost2, id1);
		sh.addProduct(name2, cost, id1);
	}

	public void setup2() throws RepetitiveException {
		sh = new ShopProgram ();
		String name = "Pepe";
		String id = "123";
		String phone = "22222";
		sh.addHumanTree(name, id, phone);

		String name1 = "lolo";
		String id1 = "1234";
		String phone1= "3333";
		sh.addHumanTree(name1, id1, phone1);

		String name2 = "Pipe";
		String id2 = "12";
		String phone2= "4444";
		sh.addHumanTree(name2, id2, phone2);
		sh.addHumanTree("asd", "111", "222222");

	}

	public void setup3() throws RepetitiveException {
		sh = new ShopProgram ();
		String name = "Pepe";
		String id = "123";
		String phone = "22222";
		sh.addHumanTree(name, id, phone);

		String name1 = "Paco";
		String id1 = "12356";
		String p1 = "22222";
		sh.addCliente(name1, id1, p1);

		String name2 = "Felipe";
		String id2 = "777";
		String phone2 = "1111";
		sh.addHumanTree(name2, id2, phone2);
	}

	@Test
	void testAddClient() throws RepetitiveException {
		setup1();


		assertTrue(sh.findClient("123").getName().equals("Pepe"));
		assertTrue(sh.findClient("123").getId().equals("123"));

		assertTrue(sh.findClient("1234").getName().equals("lolo"));
		assertTrue(sh.findClient("1234").getId().equals("1234"));
		assertTrue(sh.findClient("1234").getPrev().getName().equals("Pepe"));
		assertTrue(sh.findClient("1234").getPrev().getId().equals("123"));
	}


	@Test
	void testAddProduct() throws RepetitiveException {
		setup1();


		assertTrue(sh.findClient("123").getProd().get(0).getName().equals("Carne"));
		assertTrue(sh.findClient("123").getProd().get(0).getCost()==12323.0);


		assertTrue(sh.findClient("1234").getProd().get(0).getName().equals("ChocoRamo"));
		assertTrue(sh.findClient("1234").getProd().get(0).getCost()==200.0);
		assertTrue(sh.findClient("1234").getProd().get(1).getName().equals("Carne"));
		assertTrue(sh.findClient("1234").getProd().get(1).getCost()==12323.0);


	}

	@Test
	void testFindClient() throws RepetitiveException {
		setup1();
		
		sh.addCliente("pipe", "777", "123345");
		assertTrue(sh.findClient("123").getName().equals("Pepe"));
		assertTrue(sh.findClient("1234").getName().equals("lolo"));
		assertTrue(sh.findClient("777").getName().equals("pipe"));
	}
	
	
	@Test
	void testFindBinaryClient() throws RepetitiveException {
		setup1();
		sh.addCliente("pipe", "777", "123345");
		sh.addCliente("pp", "100", "123345");
		sh.ShowClients2();
		assertTrue(sh.findBinaryClient("123").getName().equals("Pepe"));
		assertTrue(sh.findBinaryClient("1234").getName().equals("lolo"));
		assertTrue(sh.findBinaryClient("777").getName().equals("pipe"));
		assertTrue(sh.findBinaryClient("100").getName().equals("pp"));
	}

	@Test
	void testAddHumanTree() throws RepetitiveException {
		setup2();


		assertTrue(sh.getEmpleadoRaiz().getName().equals("Pepe"));
		assertTrue(sh.getEmpleadoRaiz().getId().equals("123"));
		assertTrue(sh.getEmpleadoRaiz().getPhone().equals("22222"));

		assertTrue(sh.getEmpleadoRaiz().getDer().getName().equals("lolo"));
		assertTrue(sh.getEmpleadoRaiz().getDer().getId().equals("1234"));
		assertTrue(sh.getEmpleadoRaiz().getDer().getPhone().equals("3333"));

		assertTrue(sh.getEmpleadoRaiz().getIzq().getName().equals("Pipe"));
		assertTrue(sh.getEmpleadoRaiz().getIzq().getId().equals("12"));
		assertTrue(sh.getEmpleadoRaiz().getIzq().getPhone().equals("4444"));
	}

	@Test
	void testSearchEmployee() throws RepetitiveException {
		setup2();

		assertTrue(sh.searchEmployee("123").getName().equals("Pepe"));
		assertTrue(sh.searchEmployee("123").getId().equals("123"));
		assertTrue(sh.searchEmployee("123").getPhone().equals("22222"));


		assertTrue(sh.searchEmployee("1234").getName().equals("lolo"));
		assertTrue(sh.searchEmployee("1234").getId().equals("1234"));
		assertTrue(sh.searchEmployee("1234").getPhone().equals("3333"));


		assertTrue(sh.searchEmployee("12").getName().equals("Pipe"));
		assertTrue(sh.searchEmployee("12").getId().equals("12"));
		assertTrue(sh.searchEmployee("12").getPhone().equals("4444"));
	}

	@Test
	void testFindBinaryEmployee() throws RepetitiveException {
		setup2();

		assertTrue(sh.findBinaryEmployee("123").getName().equals("Pepe"));
		assertTrue(sh.findBinaryEmployee("123").getId().equals("123"));
		assertTrue(sh.findBinaryEmployee("123").getPhone().equals("22222"));


		assertTrue(sh.findBinaryEmployee("1234").getName().equals("lolo"));
		assertTrue(sh.findBinaryEmployee("1234").getId().equals("1234"));
		assertTrue(sh.searchEmployee("1234").getPhone().equals("3333"));



		assertTrue(sh.findBinaryEmployee("12").getName().equals("Pipe"));
		assertTrue(sh.findBinaryEmployee("12").getId().equals("12"));
		assertTrue(sh.findBinaryEmployee("12").getPhone().equals("4444"));
	}


	@Test
	void testAddClientToEmployee() throws RepetitiveException {
		setup3();
		sh.addClientToEmployee("123", "12345", "Paco", "22222");
		sh.addClientToEmployee("123", "1111", "Pepito", "77777");
		assertTrue(sh.searchEmployee("123").getClients().get(0).getName().equals("Paco"));
		assertTrue(sh.searchEmployee("123").getClients().get(1).getName().equals("Pepito"));
	}


	@Test
	void testFindingTheEmployeeOfTheMonth() throws RepetitiveException {
		setup3();
		sh.addClientToEmployee("123", "12345", "Paco", "22222");
		sh.addClientToEmployee("123", "1111", "Pepito", "77777");


		sh.addClientToEmployee("777", "12345", "Paco", "22222");
		sh.addClientToEmployee("777", "1111", "Pepito", "77777");
		sh.addClientToEmployee("777", "222222", "Ernesto", "22222");
		sh.addClientToEmployee("777", "4444444", "Batman", "77777");


		assertTrue(sh.findingTheEmployeeOfTheMonth().getName().equals("Felipe"));
	}
}
