package mynotes.springjdbc.morebasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/mynotes/springjdbc/morebasics/spring.xml");
		/*MySpringDao mySpringDao= context.getBean("mySpringDao",MySpringDao.class);
		Employee employee=new Employee();
		employee.setId(6);
		employee.setName("Jason");
		employee.setPhoneNumber("987654");
		mySpringDao.insertEmployee(employee);*/
		MySpringDaoNew mySpringDaoNew=context.getBean("mySpringDaoNew",MySpringDaoNew.class);
		System.out.println("Employee count="+mySpringDaoNew.getEmployeeCount());
	}
}
