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
		obj.setFirstName("Evan");
		obj.setLastName("Bayross");
		obj.setAge(20);
		Address adr=new Address();
		adr.setState("Delhi");
		adr.setLocation("Delhi");
		adr.setStreetNumber(12);
		obj.setAdd(adr);
		
		Book bok=new Book();
		bok.setBookName("Mathematics");
		bok.setAuth(obj);
		Book bok1=new Book();
		bok1.setBookName("Science");
		bok1.setAuth(obj);
		obj.getBuk().add(bok);
		obj.getBuk().add(bok1);
		
		
		Session session=sess.openSession();
		session.beginTransaction();
			session.persist(obj);
				session.getTransaction().commit();
				session.close();
	
	}
}
