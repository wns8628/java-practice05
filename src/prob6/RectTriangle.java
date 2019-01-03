package prob6;

public class RectTriangle  extends Shape {
	
	public RectTriangle(double a , double b) {
		super(a , b);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.getWidth() * this.getHeight())* 1/2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub					Math.pow(값, 제곱승)
		return  (this.getWidth() + this.getHeight()) + Math.sqrt( (Math.pow(getWidth(), 2)+ Math.pow(getHeight(), 2)) );
	}
	
}
