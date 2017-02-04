package com.classes;

import com.interfaces.ScaleConverter;

public class EnglishToMetricConverter implements ScaleConverter{

	@Override
	public double convertTemperature(double tempIn) {
		return (tempIn - 32) * 5/9;
	}

	@Override
	public double convertDistance(double distanceIn) {
		return 1.609 * distanceIn;
	}

	@Override
	public double convertWeight(double weightIn) {
		return weightIn/2.2;
	}

}
