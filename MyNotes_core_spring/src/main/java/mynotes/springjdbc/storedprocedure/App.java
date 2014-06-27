package mynotes.springjdbc.storedprocedure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/mynotes/springjdbc/storedprocedure/spring.xml");
		EmployeeDaoInterface empDao=context.getBean("employeeDaoSimpleJdbcCall",EmployeeDaoSimpleJdbcCall.class);
		Employee employee=empDao.getDetailsById(2);
		System.out.println(employee);
		empDao=context.getBean("employeeDaoStoredProcedure",EmployeeDaoStoredProcedure.class);
		employee=empDao.getDetailsById(1);
		System.out.println(employee);
	}
}
