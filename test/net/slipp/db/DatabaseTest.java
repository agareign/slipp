package net.slipp.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import net.slipp.user.User;
import net.slipp.user.UserTest;

import org.junit.Test;

public class DatabaseTest {

	@Test
	public void addAndFindWhenExisted() {
		User user = UserTest.TEST_USER;
		Database.addUser(user);
		
		User dbUser = Database.findByUserId(user.getUserId());
		assertEquals(user, dbUser);
	}
	
	public void addAndFindWhenNotExisted() {
		User dbUser = Database.findByUserId("userId2");
		assertNull(dbUser);
	}

}
