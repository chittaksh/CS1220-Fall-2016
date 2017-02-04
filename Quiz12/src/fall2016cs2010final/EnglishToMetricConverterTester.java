package fall2016cs2010final;

import static org.junit.Assert.*;

import org.junit.Test;

import com.classes.EnglishToMetricConverter;

public class EnglishToMetricConverterTester {

	EnglishToMetricConverter e = new EnglishToMetricConverter();
	
	@Test
	public void testFreezingConversion() {
		
		final double freezingF = 32.0;
		final double freezingC = 0.0;
		assertEquals(e.convertTemperature(freezingF), freezingC, 0.0001);		
	}

	@Test
	public void testBoilingConversion() {
		final double boilingF = 212.0;
		final double boilingC = 100.0;
		assertEquals(e.convertTemperature(boilingF), boilingC, 0.0001);		
	}
	
	@Test
	public void testFourtyConversion() {
		final double FourtyF = -40;
		final double FourtyC = -40;
		assertEquals(e.convertTemperature(FourtyF), FourtyC, 0.0001);		
	}
	
	@Test
	public void testMilesToKmConversion() {
		final double oneMile = 1;
		final double inKm = 1.609;
		assertEquals(e.convertDistance(oneMile), inKm, 0.0001);		
	}
	
	@Test
	public void testFourtyFiveMilesConversion() {
		final double Miles = 45;
		final double inKm = 72.405;
		assertEquals(e.convertDistance(Miles), inKm, 0.0001);		
	}
	
	@Test
	public void testOnePoundConversion() {
		final double Pound = 2.2;
		final double KG = 1.0;
		assertEquals(e.convertWeight(Pound), KG, 0.0001);		
	}
	
	@Test
	public void testPoundConversion() {
		final double Pound = 13;
		final double KG = 5.909;
		assertEquals(e.convertWeight(Pound), KG, 0.0001);		
	}



}
