package Animal;

import org.junit.Assert;
import org.junit.Test;
public class Tester {

	@Test
	public void shouldCreateAnimalAndReturnName(){
	
	String name = "Buster";
	
	AnimalLab1 animal = new AnimalLab1(name);
	
	Assert.assertTrue(AnimalLab1.getName().equals(name));
		
	System.out.println(name);
	
	}
	
	
}

       