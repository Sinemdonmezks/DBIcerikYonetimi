package com.sinem.icerikyönetimi.Repository;

import com.sinem.icerikyönetimi.Entity.Lesson;
import com.sinem.icerikyönetimi.Utility.MyFactoryRepository;

public class LessonRepository extends MyFactoryRepository<Lesson, Long> {

	public LessonRepository() {
		super(new Lesson());
	}

}
