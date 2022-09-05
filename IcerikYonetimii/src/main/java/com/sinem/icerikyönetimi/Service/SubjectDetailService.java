package com.sinem.icerikyönetimi.Service;

import com.sinem.icerikyönetimi.Entity.SubjectDetail;
import com.sinem.icerikyönetimi.Repository.SubjectDetailRepository;
import com.sinem.icerikyönetimi.Utility.MyFactoryService;

public class SubjectDetailService extends MyFactoryService<SubjectDetailRepository, SubjectDetail, Long> {

	public SubjectDetailService() {
		super(new SubjectDetailRepository());
	}

}
