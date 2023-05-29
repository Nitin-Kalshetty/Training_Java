package task2;

public class Electronics extends Products{
	int discount;

	public int getDiscount() {
		return discount;
	}

	public Electronics(int discount) {
		
		this.discount = discount;
	}

	public Electronics() {
		this.discount=super.discount;
	}

	
	
	
	
}
