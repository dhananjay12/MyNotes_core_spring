package mynotes.spring.hibernateMain;

import mynotes.spring.hibernateModel.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/mynotes/spring/hibernateMain/spring.xml");
		MySpringHibernateDao mySpringHibernateDao=context.getBean("mySpringHibernateDao",MySpringHibernateDao.class);
		Employee employee=mySpringHibernateDao.getEmployeeByid(2);
		System.out.println(employee);
	}
}
