package mynotes.springjdbc.basics;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class MySpringDao {	
	
	private DataSource datasource;
	private JdbcTemplate jdbcTemplate;
	public DataSource getDatasource() {
		return datasource;
	}
	@Autowired
	public void setDatasource(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	public int getEmployeeCount(){
		String sql="Select count(*) from Employee";
		return jdbcTemplate.queryForInt(sql);		
	}
	public String getEmployeeName(int id){
		String sql="Select NAME from Employee where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);		
	}
	public Employee getEmployeeDetail(int id){
		String sql="Select * from Employee where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new EmployeeMapper());		
	}
	
	public List<Employee> getEmployeeList(){
		String sql="Select * from Employee";
		return jdbcTemplate.query(sql,new EmployeeMapper());		
	}
	
	private static final class EmployeeMapper implements RowMapper<Employee>{

		public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Employee employee=new Employee();
			employee.setId(resultSet.getInt("ID"));
			employee.setName(resultSet.getString("NAME"));
			employee.setPhoneNumber(resultSet.getString("Phone"));
			return employee;
		}
		
	}
 

}
