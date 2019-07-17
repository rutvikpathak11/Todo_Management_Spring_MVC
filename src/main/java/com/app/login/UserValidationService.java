package com.app.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	
	public boolean isUserValid(String name, String password)
	{
		if(name.equals("Rutvik") && password.equals("abc123"))
			return true;
		return false;
	}

}
