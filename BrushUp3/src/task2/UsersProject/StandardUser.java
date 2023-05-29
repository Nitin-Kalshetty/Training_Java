package task2.UsersProject;

public class StandardUser extends User{

	private Integer delivery=0;
	
	public Integer getDelivery() {
		return delivery;
	}
	
	public StandardUser(Integer userId, String name, String email, String password, String mobile) {
		super(userId, name, email, password, mobile, MemberShip.STANDARD);
		// TODO Auto-generated constructor stub
	}

}
