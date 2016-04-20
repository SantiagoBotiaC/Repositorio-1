
public class Rectangle extends Shape{
	
	protected double width;
	protected double height;
	
	public Rectangle(double width, double height){
		super(4);
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return (this.height * this.width);
	}
	
	public double getPerimeter()
	{
		return (2*(this.height + this.width));
	}

}
