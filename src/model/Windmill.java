package model;

public class Windmill {
	
	public  final static double ANGLE_ROTATE = 1;
	public double rotation;
	
	
	public Windmill(double rotation) {
		
		this.rotation = rotation;
	}

	public double getRotation() {
		return rotation;
	}
	
	public void rotate() {
		rotation = (rotation+ ANGLE_ROTATE)%360;
	}
}
