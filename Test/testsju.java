import static org.junit.Assert.*;

import org.junit.Test;

import calculatorpak.Calculator;

public class testsju {

	@Test
	public void caladd(){
	   	assertEquals(30,Calculator.add(20, 10));
	}
	
	@Test
	public void  calsub(){
		assertEquals(10,Calculator.sub(20,10));
	}
	@Test
	public void calmul(){
		assertEquals(40,Calculator.mul(20, 2));
	}
	@Test
	public void caldiv(){
		assertEquals(10,Calculator.div(20, 2));
	}
}