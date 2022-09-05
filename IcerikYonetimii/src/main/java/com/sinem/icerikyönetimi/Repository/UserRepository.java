package com.sinem.icerikyönetimi.Repository;

import com.sinem.icerikyönetimi.Entity.User;
import com.sinem.icerikyönetimi.Utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User, Long> {

	public UserRepository() {
		super(new User());
	}

}
