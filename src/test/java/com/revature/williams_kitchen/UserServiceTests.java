package com.revature.williams_kitchen;

import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

class WilliamsKitchenApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserInUserServiceWorks() {
		User user = new User();
		user.setUsername("user");
		user.setPassword("ffff");
		user.setEmail("dkfjkldsjfglkd");
		user.setFirstname("dhfkjsdhfjk");
		user.setLastname("dfhsjkl");

		Assertions.assertEquals(1, userService.createUser(user).getId());
	}

	@Test
    public void createUserWorksForSeveralUsersInARow() {
		User user = new User();
        user.setUsername("user");
        user.setPassword("ffff");
        user.setEmail("dkfjkldsjfglkd");
        user.setFirstname("dhfkjsdhfjk");
        user.setLastname("dfhsjkl");

		User user1 = new User();
		user1.setUsername("user1");
		user1.setPassword("ffaaff");
		user1.setEmail("dkfjkldsjfglgfagkd");
		user1.setFirstname("dhfkdgfsdfgajsdhfjk");
		user1.setLastname("dfhsjaskl");

		User user2 = new User();
		user2.setUsername("user1");
		user2.setPassword("fffddf");
		user2.setEmail("dkfjkldsjfgdslkd");
		user2.setFirstname("hajgh1");
		user2.setLastname("fsdd");

		Assertions.assertEquals(2, userService.createUser(user).getId());
		Assertions.assertEquals(3, userService.createUser(user1).getId());
		Assertions.assertEquals(4, userService.createUser(user2).getId());

	}


	//need a way to solve this issue just in case
//	@Test
//	public void createUserInUserServiceSuccessfullyRejectsUserWithNullField() {
//		User user = new User();
//		user.setUsername(null);
//		user.setPassword("ffff");
//		user.setEmail("dkfjkldsjfglkd");
//		user.setFirstname("dhfkjsdhfjk");
//		user.setLastname("dfhsjkl");
//
//		Assertions.assertEquals(0, userService.createUser(user).getId());
//	}

}
