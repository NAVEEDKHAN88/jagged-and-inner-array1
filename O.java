package com.inner_array;

// Static inner class: Here we can create non static as well as static members

public class O {
static class B {
	static int i = 10;

	public static void show () {
		System.out.println("From static method");
	}

	}

	public static void main(String[] args) {
		O a1 = new O();
	
		B.show();
		System.out.println(B.i);
		
	}
}


