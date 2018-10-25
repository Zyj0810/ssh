package cap.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.service.AdminService;

public class AdminServiceTest {
	private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
	@Test
	public void testSayHello(){
		AdminService adminService=(AdminService) ctx.getBean("adminService"); 
		System.out.println(adminService.sayHello());
		}
	@Test
	public void testSayHello1(){
		AdminService adminService=(AdminService) ctx.getBean("adminService1"); 
		System.out.println(adminService.sayHello());
	}
	
	@Test
	public void testSayHello2(){
		AdminService adminService=(AdminService) ctx.getBean("adminService2"); 
		System.out.println(adminService.sayHello());
	}

}
