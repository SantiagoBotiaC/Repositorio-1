
public class Triangle extends Shape{
	protected double width;
	protected double height;
	
	public Triangle(double width, double height){
		super(3);
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return ((this.height * this.width)/2);
	}
	
	public double getPerimeter()
	{
		return (2*(Math.sqrt((Math.pow(height, 2) + Math.pow(width/2, 2)))))+ width;
	}
}

