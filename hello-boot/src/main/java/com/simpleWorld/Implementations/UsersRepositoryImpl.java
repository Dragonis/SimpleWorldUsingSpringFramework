package com.simpleWorld.Implementations;

import com.simpleWorld.Api.UsersRepository;
import com.simpleWorld.Domain.User;
import com.simpleWorld.Api.Logger;


public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;
	
	public UsersRepositoryImpl(Logger logger) {
		this.logger = logger;
	}
	
	public UsersRepositoryImpl(Logger logger,String localization, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repoezytorium: " + localization + "/" + dbName);
	}


	@Override
	public User createUser(String name, int age) {
		logger.log("Tworzenie użytkownika: " + name + ", lat " + age);
		return new User(name,age);
	}

	@Override
	public void setLogger(Logger logger) {
		this.logger = logger;
	}



}
