package com.simpleWorld.Api;

import com.simpleWorld.Domain.User;

public interface UsersRepository {
	User createUser(String name, int age);
	void setLogger(Logger logger);
}
