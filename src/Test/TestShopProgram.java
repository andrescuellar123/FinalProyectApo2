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
		String name1 = "lolo";
		String id1 = "1234";
		sh.addCliente(name, id);
		sh.addCliente(name1, id1);
		
		String name2 = "Carne";
		double cost = 12323;
		
		sh.addProduct(name2, cost, id);
		
		String name3 = "ChocoRamo";
		double cost2 = 200;
		
		sh.addProduct(name3, cost2, id1);
		sh.addProduct(name2, cost, id1);
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

}
