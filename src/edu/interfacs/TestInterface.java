package edu.interfacs;

public class TestInterface implements I2{

	@Override
	public void m1() {
		System.out.println("Inmplemented method");
	}
	public static void main(String[] args) {
		TestInterface ti = new TestInterface();
		ti.m1();
	}

}
