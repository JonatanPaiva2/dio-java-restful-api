package one.digitalinnovation.java_restful_api.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import one.digitalinnovation.java_restful_api.domain.model.User;
import one.digitalinnovation.java_restful_api.domain.repository.UserRepository;
import one.digitalinnovation.java_restful_api.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if (userRepository.existsById(userToCreate.getId())) {
			throw new IllegalArgumentException("This Account number already exists.");
		}
		return userRepository.save(userToCreate);
	}

}
