package com.sinem.icerikyönetimi.Repository.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.sinem.icerikyönetimi.Entity.Lesson;
import com.sinem.icerikyönetimi.Entity.Subject;
import com.sinem.icerikyönetimi.Entity.SubjectDetail;
import com.sinem.icerikyönetimi.Service.LessonService;

public class LessonRepositoryImpl {
	static LessonService lessonService;

	public static void DefaultLessonOolustur() {

		List<Subject> subjects = new ArrayList<Subject>();
		SubjectDetail subjectDetail;
		subjects = (List<Subject>) new SubjectDetail("interface", "oop", "article inheritance", LocalDate.now(),
				LocalDate.now(), true);
		subjects = (List<Subject>) new SubjectDetail("if else", "karar yapıları", "article if else", LocalDate.now(),
				LocalDate.now(), true);

		Lesson lesson1 = new Lesson("Java", "oop", subjects, LocalDate.now(), LocalDate.now(), true);
		Lesson lesson2 = new Lesson("Java", "sql", subjects, LocalDate.now(), LocalDate.now(), true);
		Lesson lesson3 = new Lesson("Java", "algoritma", subjects, LocalDate.now(), LocalDate.now(), true);

		lessonService.save(List.of(lesson1, lesson2, lesson3));

	}
}
