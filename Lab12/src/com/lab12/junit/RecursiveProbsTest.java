package com.lab12.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.lab12.classes.*;

public class RecursiveProbsTest {
	
	RecursiveProbs r = new RecursiveProbs();

	@Test
	public void testRecursiveContainsWithEmptyString() {
		String str = "";
		assertFalse(r.recursiveContains('a', str));
	}

	@Test
	public void testRecursiveContainsWithNoOccurrences() {
		String str = "The rain in Spain falls mainly on the plain.";
		assertFalse(r.recursiveContains('z', str));
	}

	@Test
	public void testRecursiveContainsWithOccurrences() {
		String str = "The rain in Spain falls mainly on the plain.";
		assertTrue(r.recursiveContains('a', str));
	}

	@Test
	public void testAllSameWithEmptyString() {
		String str = "";
		assertTrue(r.recursiveAllCharactersSame(str));
	}

	@Test
	public void testAllSameWithDifferingCharacters() {
		String str = "The rain in Spain falls mainly on the plain.";
		assertFalse(r.recursiveAllCharactersSame(str));
	}

	@Test
	public void testRecursiveAllSameWithAllSameCharacters() {
		String str = "aaaaaaa";
		assertTrue(r.recursiveAllCharactersSame(str));
	}

	@Test
	public void testRecursiveReverseEmptyString() {
		String str = "";
		assertEquals(r.recursiveReverse(str), str);
	}

	@Test
	public void testReverseNonEmptyString() {
		String str = "The rain in Spain falls mainly on the plain.";
		assertEquals(r.recursiveReverse(str), ".nialp eht no ylniam sllaf niapS ni niar ehT");
	}

	// supply three tests here for the method recursiveCount(char c, String s)

	@Test
	public void testRecursiveCountWithEmptyString(){
		String str = "";
		assertEquals(r.recursiveCount('a', str), 0);
	}
	
	@Test
	public void testRecursiveCountWithNoOccurences(){
		String str = "This is test with no occurence.";
		assertEquals(r.recursiveCount('a', str), 0);
	}
	
	@Test
	public void testRecursiveCountWithOccurences(){
		String str = "This is a test with seven occurence. aaaaaa";
		assertEquals(r.recursiveCount('a', str), 7);
	}
}
