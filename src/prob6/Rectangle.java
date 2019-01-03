package prob6;

public class Rectangle extends Shape implements Resizable{

	public Rectangle(int a , int b) {
		super(a , b);
	}
	
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		this.setWidth(getWidth()*s);
		this.setHeight(getHeight()*s);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.getWidth() * this.getHeight());
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.getWidth() + this.getHeight()) * 2 ; 
	}

}
