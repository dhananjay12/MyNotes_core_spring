package mynotes.springjdbc.storedprocedure;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EmployeeDaoStoredProcedure implements EmployeeDaoInterface {

	private JdbcTemplate jdbcTemplate;
	private EmployeeSP employeeSP;
	@Autowired
	public void setDataSource(DataSource source) {
		this.jdbcTemplate = new JdbcTemplate(source);
		this.employeeSP = new EmployeeSP(jdbcTemplate.getDataSource());
	}

	public Employee getDetailsById(int id) {
		return this.employeeSP.getDetailsById(id);
	}

}
