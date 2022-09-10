package edu.interfacs;

public class TestI1I2 implements I,I2{
	@Override
	public void m1() {
System.out.println("Multiple inhertance using interface");		
	}
	public static void main(String[] args) {
		TestI1I2 t = new TestI1I2();
		t.m1();
	}

	
	

}
