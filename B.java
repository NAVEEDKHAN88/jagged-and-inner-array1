package com.inner_array;

//Cannot convert /inherit local inner class to static inner class
public class B {
	  class C {
		static int i = 10;
		int j = 20;
	}

	static class D extends C {
	}

	public static void main(String[] args) {
		
		D d1 = new D();
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}
