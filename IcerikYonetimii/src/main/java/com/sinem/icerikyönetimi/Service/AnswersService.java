package com.sinem.icerikyönetimi.Service;

import com.sinem.icerikyönetimi.Entity.Answers;
import com.sinem.icerikyönetimi.Repository.AnswersRepository;
import com.sinem.icerikyönetimi.Utility.MyFactoryService;

public class AnswersService extends MyFactoryService<AnswersRepository, Answers, Long> {

	public AnswersService() {
		super(new AnswersRepository());
	}

}
