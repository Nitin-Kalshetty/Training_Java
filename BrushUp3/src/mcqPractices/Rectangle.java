package mcqPractices;

public class Rectangle {
	
	private String color;

	public Rectangle(String color) {
		super();
		this.color = color;
	}

	public Rectangle() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangle [color=" + color + "]";
	}
	
	

}
