package com.leandrobrotas.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandrobrotas.course.entities.User;
import com.leandrobrotas.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}