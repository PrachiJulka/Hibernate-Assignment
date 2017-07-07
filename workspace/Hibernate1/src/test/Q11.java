package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Address;
import Classes.Author;

//Create a class Address for Author with instance variables streetNumber, location, State.

public class Q11 {

public static void main(String[] args){
		
		SessionFactory sess = new Configuration().configure("/resources/Q4.cfg.xml").buildSessionFactory();
		Author obj=new Author();
		obj.setId(10);
		obj.setFirstName("Hello");
		obj.setLastName("hi");
		obj.setAge(20);
		Address adr=new Address();
		adr.setState(9);
		adr.setLocation("Delhi");
		adr.setStreetNumber(12);
		obj.setAdd(adr);
		Session session=sess.openSession();
		session.beginTransaction();
			session.save(obj);
				session.getTransaction().commit();
 session.close();
	}
}
