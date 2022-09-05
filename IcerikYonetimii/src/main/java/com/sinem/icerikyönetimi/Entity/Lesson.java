package com.sinem.icerikyönetimi.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbllesson")

public class Lesson {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(length = 40)
	private String name;

	private String description;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "lesson", fetch = FetchType.EAGER)
	private List<Subject> subjects;

	private LocalDate createAt;

	private LocalDate updateAt;

	private boolean enabled;

	public Lesson(String name, String description, List<Subject> subjects, LocalDate createAt, LocalDate updateAt,
			boolean enabled) {
		super();
		this.name = name;
		this.description = description;
		this.subjects = subjects;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.enabled = enabled;
	}

	public Lesson() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
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
		return "Lesson [id=" + id + ", name=" + name + ", description=" + description + ", subjects=" + subjects
				+ ", createAt=" + createAt + ", updateAt=" + updateAt + ", enabled=" + enabled + "]";
	}

}
