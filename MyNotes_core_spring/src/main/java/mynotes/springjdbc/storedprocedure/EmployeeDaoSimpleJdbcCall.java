package mynotes.springjdbc.storedprocedure;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoSimpleJdbcCall implements EmployeeDaoInterface {

	private DataSource dataSource;
	private SimpleJdbcCall simpleJdbcCall;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource)
				.withProcedureName("GetEmployeeDetailsById");
	}

	public Employee getDetailsById(int id) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id",id);
		Map<String, Object> out = simpleJdbcCall.execute(in);
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName((String) out.get("out_name"));
		employee.setPhoneNumber((String) out.get("out_phone"));
		return employee;
	}

}
