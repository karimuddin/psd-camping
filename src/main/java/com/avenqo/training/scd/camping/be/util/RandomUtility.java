package com.avenqo.training.scd.camping.be.util;

import org.apache.commons.math3.random.RandomDataGenerator;

public class RandomUtility {

	public static Long generateLong() {

		return new RandomDataGenerator().nextLong(1L, Long.MAX_VALUE);
	}
}
