package task2;

import java.util.Objects;

public class Products {
	int discount ;

	public Products(int discount) {
		super();
		this.discount = discount;
	}

	public Products() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(discount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return discount == other.discount;
	}
	
	
}
