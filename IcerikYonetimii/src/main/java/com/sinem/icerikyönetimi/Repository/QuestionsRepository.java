package com.sinem.icerikyönetimi.Repository;

import com.sinem.icerikyönetimi.Entity.Questions;
import com.sinem.icerikyönetimi.Utility.MyFactoryRepository;

public class QuestionsRepository extends MyFactoryRepository<Questions, Long> {

	public QuestionsRepository() {
		super(new Questions());
	}

}
