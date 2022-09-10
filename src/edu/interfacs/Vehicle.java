package edu.interfacs;

public class Vehicle implements Movable {

	@Override
	public  void move() {
System.out.println("Speed : "+AVGSPEED+"kmph");		
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.move();
	}
	@Override
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
