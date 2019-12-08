package com.appstude.batch;

import com.appstude.model.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<User,User> {

	 private static final Map<String, String> DEPT_NAMES =new HashMap<>();

	    public Processor() {
	    	
	        DEPT_NAMES.put("001", "Technology");
	        DEPT_NAMES.put("002", "Operations");
	        DEPT_NAMES.put("003", "Accounts");
	        DEPT_NAMES.put("004", "Research");
	        DEPT_NAMES.put("005", "Tactics");
	        DEPT_NAMES.put("006", "Branding");
	        DEPT_NAMES.put("007", "Metrics");
	        DEPT_NAMES.put("008", "Solutions");
	        DEPT_NAMES.put("009", "Integration");
	        DEPT_NAMES.put("010", "Security");
	    }
	
	@Override
	public User process(User user) throws Exception {
		
		String deptCode = user.getDept();
		String deptName = DEPT_NAMES.get(deptCode);
		user.setDept(deptName);
		user.setTime(new Date());
		 System.out.println(String.format("Converted from [%s] to [%s]", deptCode, deptName));
		return user;
	}
	
	

}
