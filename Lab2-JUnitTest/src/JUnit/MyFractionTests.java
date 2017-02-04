package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.MyFraction;

public class MyFractionTests {
	
	MyFraction fraction = new MyFraction(2, 5, '-');

	@Test
	public void testAddition() {

		MyFraction result = fraction.add(new MyFraction(3, 4, '+'));
		
		assertEquals(new MyFraction(7,20,'+').toString(), result.toString());
	}
	
	@Test
	public void testAdditionTwo() {

		MyFraction result = fraction.add(new MyFraction(3, 4, '-'));
		
		assertEquals(new MyFraction(23,20,'-').toString(), result.toString());
	}
	
	@Test
	public void testSubstraction(){
		
		MyFraction result = fraction.subtract(new MyFraction(1, 19, '-'));
		
		assertEquals(new MyFraction(33,95,'-').toString(), result.toString());
	}
	
	@Test
	public void testSubstractionTwo(){
				
		MyFraction result = fraction.subtract(new MyFraction(1, 19, '+'));
		
		assertEquals(new MyFraction(43,95,'-').toString(), result.toString());
	}
	
	@Test
	public void testMultiplication(){
		
		MyFraction result = fraction.multiply(new MyFraction(3, 4, '+'));
		
		assertEquals(new MyFraction(6,20,'-').toString(), result.toString());
	}
	
	@Test
	public void testMultiplicationTwo(){
		
		MyFraction result = fraction.multiply(new MyFraction(3, 4, '-'));
		
		assertEquals(new MyFraction(6,20,'+').toString(), result.toString());
	}
	
	
	@Test
	public void testDivide(){
		
		MyFraction result = fraction.divide(new MyFraction(1, 19, '-'));
		
		assertEquals(new MyFraction(38,5,'+').toString(), result.toString());
	}
	
	@Test
	public void testDivideTwo(){
		
		MyFraction result = fraction.divide(new MyFraction(1, 19, '+'));
		
		assertEquals(new MyFraction(38,5,'-').toString(), result.toString());
	}

}
