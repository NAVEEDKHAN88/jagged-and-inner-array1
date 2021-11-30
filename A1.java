package com.inner_array;

public class A1 {
	
	//We can create multiple local inner classes

	class B {
		int i = 10;
	}

	class C {
		int j = 20;
	}

	public static void main(String[] args) {
		A1 a1 = new A1();
		B b1 = a1.new B();
		System.out.println(b1.i);
		C c1 = a1.new C();
		System.out.println(c1.j);
	}
}
