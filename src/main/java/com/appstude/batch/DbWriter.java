package com.appstude.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appstude.model.User;
import com.appstude.repository.UserRepository;

@Component
public class DbWriter implements ItemWriter<User> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void write(List<? extends User> users) throws Exception {
		
		System.out.println("Data Saved for user : "+users);
		userRepository.saveAll(users);
		
	}

}
