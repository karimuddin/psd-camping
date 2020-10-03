package com.avenqo.training.scd.camping.be.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.math3.random.RandomDataGenerator;

public class RandomUtility {

	public static Long generateLong() {

		return new RandomDataGenerator().nextLong(1L, Long.MAX_VALUE);
	}

	public static String generateString() {

		int length = 10;
		boolean useLetters = true;
		boolean useNumbers = false;
		return RandomStringUtils.random(length, useLetters, useNumbers);
	}
}
