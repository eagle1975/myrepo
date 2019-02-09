package com.test.iotax.except;

@SuppressWarnings("serial")
public class SpeedException extends Exception {

	public String toString() {
		return "Negative speed value!";
	}
}
