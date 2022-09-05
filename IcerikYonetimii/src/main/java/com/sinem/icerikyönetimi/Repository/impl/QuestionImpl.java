package com.sinem.icerikyönetimi.Repository.impl;

import java.time.LocalDate;
import java.util.List;

import com.sinem.icerikyönetimi.Entity.Questions;
import com.sinem.icerikyönetimi.Service.QuestionsService;

public class QuestionImpl {
	static private QuestionsService questionsService;

	public static void DefaultQuestionsOlustur() {
		Questions question = new Questions("if else", "if else nedir?", LocalDate.now(), LocalDate.now(), true);
		questionsService.save(List.of(question));
	}
}
