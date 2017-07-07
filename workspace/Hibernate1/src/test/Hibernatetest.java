package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.*;

public class Hibernatetest {

	 public static void  main(String[] args) {
			SessionFactory sess = new Configuration().configure("/resources/Hibernate.cfg.xml").buildSessionFactory();
		Author auth=new Author();
		//auth.setId("two");
		auth.setFirstName("Kathy");
		auth.setLastName("Sierra");
		auth.setAge(20);
		auth.setDate(new Date());
		
			Session session=sess.openSession();
			session.beginTransaction();
			session.save(auth);
			session.getTransaction().commit();
	 }	

}
