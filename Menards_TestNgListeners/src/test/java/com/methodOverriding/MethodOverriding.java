package com.methodOverriding;

public class MethodOverriding {
	
	final void mom() {
		System.out.println("I love my mom");
	}
	
	public static void family() {
		System.out.println("We have six family members");
	}
	
	protected static void uncle() {
		System.out.println("We have uncle Bin");
	}

	 static void sister() {
		System.out.println("We have sisters");
	}

	private static void brother() {
			System.out.println("We have brothers");
		}
	
	

}

class Test extends MethodOverriding{
	public static void family1() {
		System.out.println("We have five family members");
	}
	
	protected static void uncle1() {
		System.out.println("We have two uncles");
		MethodOverriding mo = new MethodOverriding();
		mo.family();
		mo.sister();
		mo.uncle();
		
	}

	 static void sister1() {
		System.out.println("We have sisters");
	}

	private static void brother1() {
			System.out.println("We have brothers");
		}
}

class Test1 extends Test {
	public static void family2() {
		System.out.println("We have four family members");
	}

	 static void sister2() { //default method cannot inherit private mathod
		System.out.println("We have sisters2");
		Test to = new Test();
		to.family();
		to.family1();
		to.sister();
		to.sister1();
		to.uncle();
		to.uncle1();
		
	}

	private static void brother2() { //Private methods can inherit all types
			System.out.println("We have brothers2");
			Test1 t1 = new Test1();
			t1.brother2();
			//final method cannot be inherited by public, protected , default and private methods
		}
	
}
