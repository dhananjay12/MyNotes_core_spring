package mynotes.springjdbc.storedprocedure;

import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class EmployeeSP extends StoredProcedure {

	private static final String proc_name = "GetEmployeeDetailsById";

	public EmployeeSP(DataSource datasource) {
		super(datasource, proc_name);
		declareParameter(new SqlParameter("in_id", Types.INTEGER));
		declareParameter(new SqlOutParameter("out_name", Types.VARCHAR));
		declareParameter(new SqlOutParameter("out_phone", Types.VARCHAR));
		compile();
	}
	
	public Employee getDetailsById(int id){
		Map<String,Object> results = super.execute(id);
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName((String) results.get("out_name"));
		employee.setPhoneNumber((String) results.get("out_phone"));
		return employee;
	}

}
