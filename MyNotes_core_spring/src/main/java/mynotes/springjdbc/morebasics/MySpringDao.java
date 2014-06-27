package mynotes.springjdbc.morebasics;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class MySpringDao {	
	
	private DataSource datasource;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public DataSource getDatasource() {
		return datasource;
	}
	@Autowired
	public void setDatasource(DataSource datasource) {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(datasource);
	}
	
	public void insertEmployee(Employee employee){
		String sql="INSERT INTO EMPLOYEE (ID,NAME,PHONE) values (:id,:name,:phone)";
		SqlParameterSource sqlParameterSource=new MapSqlParameterSource("id", employee.getId())
											      .addValue("name", employee.getName())
											      .addValue("phone", employee.getPhoneNumber());
		
		namedParameterJdbcTemplate.update(sql, sqlParameterSource);
	}
 

}
