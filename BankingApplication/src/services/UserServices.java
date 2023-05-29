package services;

import models.users.User;

public interface UserServices {

	public User createUser(User user);
	public User deleteUser(User user);
	public User updateUser(User user);
	public User getUserById(String id);
}
