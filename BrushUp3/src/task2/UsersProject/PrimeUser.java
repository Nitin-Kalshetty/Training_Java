package task2.UsersProject;

public class PrimeUser extends User{
	
	private Integer delivery=0;
	

	public PrimeUser(Integer userId, String name, String email, String password, String mobile) {
		super(userId, name, email, password, mobile, MemberShip.PRIME);
	}
	
	public Integer getDelivery() {
		return delivery;
	}

	
}
