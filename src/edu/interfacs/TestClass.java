package edu.interfacs;

public class TestClass implements Movable, Rollable {

	@Override
	public boolean isRollable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		TestClass t = new TestClass();
		System.out.println(t.isMovable());;
		System.out.println(t.isRollable());;
	}
	

}
