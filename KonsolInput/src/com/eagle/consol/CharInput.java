package com.eagle.consol;

public class CharInput {

	public static void main(String[] args) {
		int x;
		try {
			x = System.in.read();
			char c = (char)x;
			System.out.println("Character code " + c +" = " + x);
		} catch (java.io.IOException e) {
			System.err.println("Input Error" + e);
			
		}
	}

}
