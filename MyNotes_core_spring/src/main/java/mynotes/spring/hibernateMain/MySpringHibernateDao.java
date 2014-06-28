package mynotes.spring.hibernateMain;

import mynotes.spring.hibernateModel.Employee;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MySpringHibernateDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Employee getEmployeeByid(int id) {
		return (Employee) getSessionFactory().openSession().get(Employee.class,id);

	}

}
