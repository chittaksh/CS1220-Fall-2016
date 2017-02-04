package JUnit;

import java.util.Arrays;

import org.junit.Test;

import Classes.MySet;
import junit.framework.TestCase;

public class MySetTest extends TestCase {

	MySet set = new MySet(new int[]{1, 2, 3, 4, 5, 6, 12, 1, 2, 3, 4, 5 });
	
	//If duplicate values are deleted.
	@Test
	public void testDuplicate(){
		
		assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 12}, set.getValues()));
	}
	
	//Adding two sets.
	@Test
	public void testAdd(){
		
		MySet result = set.add(new MySet(new int[]{2, 3, 4, 7, 8, 9}));
		//System.out.println(set.getValues());
		assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 12, 7, 8, 9}, result.getValues()));
	}
	
	//Substracting two sets.
	@Test
	public void testSubstract(){
		
		MySet result = set.subtract(new MySet(new int[]{2, 3, 4, 7, 8, 9, 13, 24, 35}));
		//System.out.println(set.getValues());
		assertTrue(Arrays.equals(new int[]{7, 8, 9, 13, 24, 35}, result.getValues()));
	}
	
	//Multiplying two sets.
	@Test
	public void testMultiply(){
		
		MySet result = set.multiply(new MySet(new int[]{1, 2, 3, 4, 5, 13, 24, 35}));
		//System.out.println(set.getValues());
		assertTrue(Arrays.equals(new int[]{6, 12, 13, 24, 35}, result.getValues()));
	}
	
	//Divide two sets.
	@Test
	public void testDivide(){
		
		MySet result = set.divide(new MySet(new int[]{1, 2, 3, 4, 5, 13, 24, 35}));
		//System.out.println(set.getValues());
		assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5}, result.getValues()));
	}
}
