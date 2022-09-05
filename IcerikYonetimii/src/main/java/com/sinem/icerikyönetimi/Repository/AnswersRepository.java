package com.sinem.icerikyönetimi.Repository;

import com.sinem.icerikyönetimi.Entity.Answers;
import com.sinem.icerikyönetimi.Utility.MyFactoryRepository;

public class AnswersRepository extends MyFactoryRepository<Answers, Long> {

	public AnswersRepository() {
		super(new Answers());
	}

}
