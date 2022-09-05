package com.sinem.icerikyönetimi.Service;

import com.sinem.icerikyönetimi.Entity.Lesson;
import com.sinem.icerikyönetimi.Repository.LessonRepository;
import com.sinem.icerikyönetimi.Utility.MyFactoryService;

public class LessonService extends MyFactoryService<LessonRepository, Lesson, Long> {

	public LessonService() {
		super(new LessonRepository());
	}

}
