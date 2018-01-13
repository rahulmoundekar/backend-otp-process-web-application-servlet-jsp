package com.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SimpleOTPGenerator {

	protected SimpleOTPGenerator() {
	}

	public static String random(int size) {

		StringBuilder generatedToken = new StringBuilder();
		try {
			SecureRandom number = SecureRandom.getInstance("SHA1PRNG");
			// Generate 20 integers 0..20
			for (int i = 0; i < size; i++) {
				generatedToken.append(number.nextInt(9));
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return generatedToken.toString();
	}

	public static void main(String[] args) {
		System.out.println(random(4));
	}
}
