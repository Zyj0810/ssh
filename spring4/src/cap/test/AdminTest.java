package cap.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.bean.Admin;


public class AdminTest {
	 private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  

	@Test
	public void testAdmin1(){
		Admin admin=(Admin) ctx.getBean("admin1"); 
		System.out.println(admin.getId()+":"+admin.getUsername()+":"+admin.getPassword());
	}
	@Test
	public void testAdmin2(){
		Admin admin=(Admin) ctx.getBean("admin2"); 
		System.out.println(admin.getId()+":"+admin.getUsername()+":"+admin.getPassword());
	}
	@Test
	public void testAdmin3(){
		Admin admin=(Admin) ctx.getBean("admin3"); 
		System.out.println(admin.getId()+":"+admin.getUsername()+":"+admin.getPassword());
	}
	
	



}
