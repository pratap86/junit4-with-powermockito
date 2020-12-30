package com.pratap.powermock.utils;

import java.util.Random;

public final class IDGenrator {

	private static final Random RANDOM = new Random();
	private static final String ALPHABET = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public static String generateId(int length) {
		return generateRandomString(length);
	}

	private static String generateRandomString(int length) {
		
		StringBuilder returnValue = new StringBuilder();
		for(int i = 0 ; i < length; i++) {
			returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}		
		return new String(returnValue);
	}
}
