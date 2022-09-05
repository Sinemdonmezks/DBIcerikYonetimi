package com.sinem.icerikyönetimi.Repository;

import com.sinem.icerikyönetimi.Entity.SubjectDetail;
import com.sinem.icerikyönetimi.Utility.MyFactoryRepository;

public class SubjectDetailRepository extends MyFactoryRepository<SubjectDetail, Long> {

	public SubjectDetailRepository() {
		super(new SubjectDetail());
	}

}
