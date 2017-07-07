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
		obj.setFirstName("Hello");
		obj.setLastName("hi");
		obj.setAge(20);
		Address adr=new Address();
		adr.setState(9);
		adr.setLocation("Delhi");
		adr.setStreetNumber(12);
		obj.setAdd(adr);
		
		Author obj1=new Author();
		obj1.setId(11);
		obj1.setFirstName("prachi");
		obj1.setLastName("julka");
		obj1.setAge(20);
		Address adr1=new Address();
		adr1.setState(1);
		adr1.setLocation("Delhi");
		adr1.setStreetNumber(11);
		obj1.setAdd(adr);
		
		Book bok=new Book();
		bok.setBid(01);
		bok.setBookName("Mathematics");
		
		Book bok1=new Book();
		bok1.setBid(02);
		bok1.setBookName("Science");
		//bok1.getLs().add(obj);
		//bok.getLs().add(obj);
		
		obj.getBuk().add(bok);
		obj.getBuk().add(bok1);
		Session session=sess.openSession();
		session.beginTransaction();
			session.save(obj);
			session.save(bok);
			session.save(bok1);
				session.getTransaction().commit();
				session.close();
	
	}
}
