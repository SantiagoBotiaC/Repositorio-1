
public abstract class Shape {
	
	protected int numSides;

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}
	
	public double getArea()
	{
		return 0;
	}
	
	public double getPerimeter()
	{
		return 0;
	}

}
