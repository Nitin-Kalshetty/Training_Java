package task2.UsersProject;

public class GuestUser extends User{

	public GuestUser(Integer userId, String name, String email, String password, String mobile) {
		super(userId, name, email, password, mobile, MemberShip.GUEST);
		// TODO Auto-generated constructor stub
	}

}
