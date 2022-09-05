package com.sinem.icerikyönetimi.Entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tblanswers")

public class Answers {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Questions questions;

	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	@Column(length = 2000, nullable = false)
	private String answers;
	@Temporal(TemporalType.TIME)
	private LocalDate createAt;
	@Temporal(TemporalType.TIME)
	private LocalDate updateAt;

	private boolean enabled;

	public Answers(Questions questions, User user, String answers, LocalDate createAt, LocalDate updateAt,
			boolean enabled) {
		super();
		this.questions = questions;
		this.user = user;
		this.answers = answers;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.enabled = enabled;
	}

	public Answers() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}

	public LocalDate getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDate updateAt) {
		this.updateAt = updateAt;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Answers [id=" + id + ", questions=" + questions + ", user=" + user + ", answers=" + answers
				+ ", createAt=" + createAt + ", updateAt=" + updateAt + ", enabled=" + enabled + "]";
	}

}
