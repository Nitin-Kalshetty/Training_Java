package task2.UsersProject;

import java.util.Objects;

public class User {

	private String userId;
	private String name;
	private String email;
	private String password;
	private String mobile;
	private Integer delivery=120;
	private MemberShip membership;
	
	
	
	public User(Integer userId, String name, String email, String password, String mobile, MemberShip membership) {
		super();
		this.userId = "US_"+userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.membership = membership;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = "US_"+userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public Integer getDelivery() {
		return delivery;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public MemberShip getMembership() {
		return membership;
	}
	public void setMembership(MemberShip membership) {
		this.membership = membership;
	}
	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userId, other.userId);
	}
	
	
	
	
	
	
	
	
}
