package com.sinem.icerikyönetimi.Service;

import com.sinem.icerikyönetimi.Entity.User;
import com.sinem.icerikyönetimi.Repository.UserRepository;
import com.sinem.icerikyönetimi.Utility.MyFactoryService;

public class UserService extends MyFactoryService<UserRepository, User, Long> {

	public UserService() {
		super(new UserRepository());
	}

}
