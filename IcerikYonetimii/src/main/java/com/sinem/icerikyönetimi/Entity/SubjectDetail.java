package com.sinem.icerikyönetimi.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblsubjectdetail")
public class SubjectDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@OneToOne()
	@JoinColumn(name = "subject_id", referencedColumnName = "id")
	private Subject subject;

	private User user;

	private String title;

	private String discription;

	private String article;

	private LocalDate createAt;

	private LocalDate updateAt;

	private boolean enabled;

	public SubjectDetail(Subject subject, User user, String title, String discription, String article,
			LocalDate createAt, LocalDate updateAt, boolean enabled) {
		super();
		this.subject = subject;
		this.user = user;
		this.title = title;
		this.discription = discription;
		this.article = article;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.enabled = enabled;
	}

	public SubjectDetail(String title, String discription, String article, LocalDate createAt, LocalDate updateAt,
			boolean enabled) {
		super();
		this.title = title;
		this.discription = discription;
		this.article = article;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.enabled = enabled;
	}

	public SubjectDetail() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
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
		return "SubjectDetail [id=" + id + ", subject=" + subject + ", user=" + user + ", title=" + title
				+ ", discription=" + discription + ", article=" + article + ", createAt=" + createAt + ", updateAt="
				+ updateAt + ", enabled=" + enabled + "]";
	}

}
