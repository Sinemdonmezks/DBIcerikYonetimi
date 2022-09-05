package com.sinem.icerikyönetimi.Entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblsubject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	private Lesson lesson;

	private LocalDate createAt;

	private LocalDate updateAt;

	private boolean enabled;

	public Subject(String name, Lesson lesson, LocalDate createAt, LocalDate updateAt, boolean enabled) {
		super();
		this.name = name;
		this.lesson = lesson;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.enabled = enabled;
	}

	public Subject() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
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
		return "Subject [id=" + id + ", name=" + name + ", lesson=" + lesson + ", createAt=" + createAt + ", updateAt="
				+ updateAt + ", enabled=" + enabled + "]";
	}

}
