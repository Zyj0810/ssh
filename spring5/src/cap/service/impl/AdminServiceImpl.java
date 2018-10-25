package cap.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cap.bean.Admin;
import cap.service.AdminService;
@Service(value="adminService")
public class AdminServiceImpl implements AdminService {
	//@Autowired
	@Resource
	@Qualifier(value="admin")
	private Admin admin;
	
	public String sayHello(){
		return "ÄãºÃ£º" +admin.getUsername();
	}

}
