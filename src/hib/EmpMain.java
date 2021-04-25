package hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {
	

	public static void main(String[] args)
	{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session ses=factory.openSession();
	    Employee e1=new Employee(109,"Steve","nanded",55000);
		ses.save(e1);
		//Employee e=(Employee)ses.get(Employee.class,109);
		//ses.delete(e);
		Transaction tx=ses.beginTransaction();
		//Query query=ses.createQuery("FROM empstar");
		//System.out.println(query.list());
		tx.commit();
		System.out.println("success");
		//Query q=ses.createQuery("from employee");
		//System.out.println(q.list());
	}
}