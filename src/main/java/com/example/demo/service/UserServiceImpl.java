package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.respository.UserRespository;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	UserRespository repository;
	
	@Override
	public String save(User user) {
		System.out.println(user.getAge());
		repository.save(user);
		return user.getName();
		
	}
	

}
