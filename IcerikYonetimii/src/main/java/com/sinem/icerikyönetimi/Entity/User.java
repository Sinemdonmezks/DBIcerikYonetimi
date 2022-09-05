package com.sinem.icerikyönetimi.Entity;

import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinem.icerikyönetimi.enums.ERole;

@Entity
@Table(name = "tbluser")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String name;

	private String surname;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	@Basic(optional = false)
	private ERole role;

	private LocalDate createAt;

	private LocalDate updateAt;

	private boolean enabled;

	public User(String name, String surname, ERole role, LocalDate createAt, LocalDate updateAt, boolean enabled) {
		super();
		this.name = name;
		this.surname = surname;
		this.role = role;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.enabled = enabled;
	}

	public User() {
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ERole getRole() {
		return role;
	}

	public void setRole(ERole role) {
		this.role = role;
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
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", role=" + role + ", createAt="
				+ createAt + ", updateAt=" + updateAt + ", enabled=" + enabled + "]";
	}

}
