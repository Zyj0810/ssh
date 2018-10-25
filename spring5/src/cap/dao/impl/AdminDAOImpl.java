package cap.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cap.bean.Admin;
import cap.dao.AdminDAO;

@Repository(value="adminDAO")
public class AdminDAOImpl implements AdminDAO {
	@Resource
	private Admin admin1;

	@Override
	public String sayHi() {
		return "ฤ๚บรฃบ"+admin1.getUsername();
	}

}
