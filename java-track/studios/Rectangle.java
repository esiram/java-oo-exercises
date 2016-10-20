
public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getPerimeter() {
		return (2*(this.height + this.width));
	}
	
	public int getArea() {
		return (this.height * this.width);
	}
	
	public boolean compareRec(Rectangle other) {
		if(this.getArea() <= other.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.width == this.height) {
			return true;
		}
		else {
			return false;
		}
		
	}


	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(1, 1);
		Rectangle yourRectangle = new Rectangle (2,1);
		System.out.println(myRectangle.getArea());
		System.out.println(myRectangle.getPerimeter());
		System.out.println(myRectangle.compareRec(yourRectangle));
		//System.out.println(myRectangle.isSquare());
	}

}

