package com.sinem.icerikyönetimi.Service;

import com.sinem.icerikyönetimi.Entity.Subject;
import com.sinem.icerikyönetimi.Repository.SubjectRepository;
import com.sinem.icerikyönetimi.Utility.MyFactoryService;

public class SubjectService extends MyFactoryService<SubjectRepository, Subject, Long> {

	public SubjectService() {
		super(new SubjectRepository());
	}

}
