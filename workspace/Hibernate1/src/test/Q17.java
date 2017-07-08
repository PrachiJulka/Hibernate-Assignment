package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Address;
import Classes.Author;
import Classes.Book;

//Q17Implement Many to Many Mapping between Author and Book.
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
		
		Author obj1=new Author();
		obj1.setFirstName("R.S");
		obj1.setLastName("Aggarwal");
		obj1.setAge(60);
		Address adr1=new Address();
		adr.setState("Delhi");
		adr.setLocation("Delhi");
		adr.setStreetNumber(12);
		obj1.setAdd(adr);
		
		Book bok=new Book();
		bok.setBookName("Mathematics");
		bok.getAuth().add(obj);
		bok.getAuth().add(obj1);
		Book bok1=new Book();
		bok1.setBookName("Science");
		bok1.getAuth().add(obj);
		bok1.getAuth().add(obj1);
		obj.getBuk().add(bok);
		obj.getBuk().add(bok1);
		
		Session session=sess.openSession();
		session.beginTransaction();
			session.persist(obj);
			session.persist(obj1);
				session.getTransaction().commit();
				session.close();
	
	}
}
