package com.sinem.icerikyönetimi.Repository.impl;

import java.time.LocalDate;
import java.util.List;

import com.sinem.icerikyönetimi.Entity.User;
import com.sinem.icerikyönetimi.Service.UserService;
import com.sinem.icerikyönetimi.enums.ERole;

public class UserRepositoryImpl {

	static private UserService userService;

	public static void DefaultUserOlustur() {
		User editör1 = new User("Editör1", "Deneme1", ERole.EDITOR, LocalDate.now(), LocalDate.now(), false);
		User editör2 = new User("Editör2", "Deneme2", ERole.EDITOR, LocalDate.now(), LocalDate.now(), false);
		User editör3 = new User("Editör3", "Deneme3", ERole.EDITOR, LocalDate.now(), LocalDate.now(), false);
		User editör4 = new User("Editör4", "Deneme4", ERole.EDITOR, LocalDate.now(), LocalDate.now(), false);
		User editör5 = new User("Editör5", "Deneme5", ERole.EDITOR, LocalDate.now(), LocalDate.now(), false);
		User admin = new User("Admin", "DenemeA", ERole.ADMIN, LocalDate.now(), LocalDate.now(), false);
		User user1 = new User("User1", "DenemeU1", ERole.USER, LocalDate.now(), LocalDate.now(), false);
		User user2 = new User("User2", "DenemeU2", ERole.USER, LocalDate.now(), LocalDate.now(), false);
		userService.save(List.of(editör1, editör2, editör3, editör4, editör5, admin, user1, user2));
	}

}
