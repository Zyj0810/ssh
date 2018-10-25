package cap.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.dao.AdminDAO;

public class AdminDAOTest {
	private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
	
	@Test
	public void testSayHi() {
		AdminDAO adminDAO=(AdminDAO) ctx.getBean("adminDAO");
		System.out.println(adminDAO.sayHi());
	}

}
