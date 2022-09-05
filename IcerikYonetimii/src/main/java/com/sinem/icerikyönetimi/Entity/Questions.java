package com.sinem.icerikyönetimi.Entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblquestions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@OneToOne(mappedBy = "subjectDetail")
	private SubjectDetail subjectDetail;

	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	@Column(length = 200, nullable = false)
	private String title;

	@Column(length = 2000, nullable = false)
	private String question;

	private LocalDate createAt;

	private LocalDate updateAt;

	private boolean enabled;

	public Questions(SubjectDetail subjectDetail, User user, String title, String question, LocalDate createAt,
			LocalDate updateAt, boolean enabled) {
		super();
		this.subjectDetail = subjectDetail;
		this.user = user;
		this.title = title;
		this.question = question;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.enabled = enabled;
	}

	public Questions(String title, String question, LocalDate createAt, LocalDate updateAt, boolean enabled) {
		super();

		this.title = title;
		this.question = question;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.enabled = enabled;
	}

	public Questions() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SubjectDetail getSubjectDetail() {
		return subjectDetail;
	}

	public void setSubjectDetail(SubjectDetail subjectDetail) {
		this.subjectDetail = subjectDetail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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
		return "Questions [id=" + id + ", subjectDetail=" + subjectDetail + ", user=" + user + ", title=" + title
				+ ", question=" + question + ", createAt=" + createAt + ", updateAt=" + updateAt + ", enabled="
				+ enabled + "]";
	}

}
