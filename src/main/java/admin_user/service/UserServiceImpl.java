package admin_user.service;

import admin_user.dto.UserDto;
import admin_user.model.User;
import admin_user.repositories.UserRepository;

public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	@Override
	public User save(UserDto userDto) {
		 User user = new User(userDto.getEmail(), userDto.getPassword(), userDto.getRole(), userDto.getFullname());
		return userRepository.save(user);
	}

}
