package com.sinem.icerikyönetimi.Repository;

import com.sinem.icerikyönetimi.Entity.Subject;
import com.sinem.icerikyönetimi.Utility.MyFactoryRepository;

public class SubjectRepository extends MyFactoryRepository<Subject, Long> {

	public SubjectRepository() {
		super(new Subject());
	}

}
