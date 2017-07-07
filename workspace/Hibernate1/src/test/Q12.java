package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Address;
import Classes.Author;

public class Q12 {
	public static void main(String[] args){
		SessionFactory sess = new Configuration().configure("/resources/Q4.cfg.xml").buildSessionFactory();
		Author obj=new Author();
		obj.setId(1);
		obj.setFirstName("Hello");
		obj.setLastName("hi");
		obj.setAge(20);
		Address adr=new Address();
		adr.setState(9);
		adr.setLocation("Delhi");
		adr.setStreetNumber(12);
		obj.setAdd(adr);
		List<String> ls=new ArrayList<>();
		ls.add("Maths");
		ls.add("Science");
		ls.add("sst");
		ls.add("Geography");
		obj.setLs(ls);
		
		Session session=sess.openSession();
		session.beginTransaction();
		session.persist(obj);
		session.getTransaction().commit();
		session.close();
	}

}
