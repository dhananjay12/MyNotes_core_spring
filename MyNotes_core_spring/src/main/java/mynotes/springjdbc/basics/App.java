package mynotes.springjdbc.basics;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/mynotes/springjdbc/basics/spring.xml");
		MySpringDao mySpringDao= context.getBean("mySpringDao",MySpringDao.class);
		System.out.println("Total Count=>"+mySpringDao.getEmployeeCount());	
		System.out.println("Name=>"+mySpringDao.getEmployeeName(3));
		System.out.println("Employee=>"+mySpringDao.getEmployeeDetail(4));
		
		List<Employee> myList=mySpringDao.getEmployeeList();
		System.out.println("List=>");
		for (Employee employee : myList) {
			System.out.println(employee);
		}
	}
}
