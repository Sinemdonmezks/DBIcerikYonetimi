package com.sinem.icerikyönetimi.Service;

import com.sinem.icerikyönetimi.Entity.Questions;
import com.sinem.icerikyönetimi.Repository.QuestionsRepository;
import com.sinem.icerikyönetimi.Utility.MyFactoryService;

public class QuestionsService extends MyFactoryService<QuestionsRepository, Questions, Long> {

	public QuestionsService() {
		super(new QuestionsRepository());
	}

}
