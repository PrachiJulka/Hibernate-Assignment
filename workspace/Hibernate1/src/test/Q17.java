package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Address;
import Classes.Author;
import Classes.Book;

public class Q17 {

	public static void main(String[] args){
		SessionFactory sess = new Configuration().configure("/resources/Q17.cfg.xml").buildSessionFactory();
		Author obj=new Author();
		obj.setId(10);
		obj.setFirstName("Evan");
		obj.setLastName("Bayross");
		obj.setAge(20);
		Address adr=new Address();
		adr.setState("Delhi");
		adr.setLocation("Delhi");
		adr.setStreetNumber(12);
		obj.setAdd(adr);
		
		
		
		Book bok=new Book();
		bok.setBid(01);
		bok.setBookName("Mathematics");
		bok.setAuth(obj);
		Book bok1=new Book();
		bok1.setBid(02);
		bok1.setBookName("Science");
		//bok1.getLs().add(obj);
		//bok.getLs().add(obj);
		bok1.setAuth(obj);
		
		Session session=sess.openSession();
		session.beginTransaction();
			session.save(obj);
			session.save(bok);
			session.save(bok1);
				session.getTransaction().commit();
				session.close();
	
	}
}
