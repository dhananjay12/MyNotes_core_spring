package mynotes.springjdbc.morebasics;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class MySpringDaoNew extends JdbcDaoSupport {
	
	//nothing here
	
	public int getEmployeeCount(){
		String sql="Select count(*) from Employee";
		return this.getJdbcTemplate().queryForInt(sql);		
	}

}
