package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Address;
import Classes.Author;
import Classes.Book;

public class Q16 {
	public static void main(String[] args){
		SessionFactory sess = new Configuration().configure("/resources/Q17.cfg.xml").buildSessionFactory();
		Author obj=new Author();
		obj.setId(11);
		obj.setFirstName("Hello");
		obj.setLastName("hi");
		obj.setAge(20);
		Address adr=new Address();
		adr.setState(2);
		adr.setLocation("Delhi");
		adr.setStreetNumber(11);
		obj.setAdd(adr);
		
		
		Book bok=new Book();
		bok.setBid(11);
		bok.setBookName("Mathematics");
		bok.setAuth(obj);
		obj.getBuk().add(bok);
		
		Book bok1=new Book();
		bok1.setBid(02);
		bok1.setBookName("Science");
		bok1.setAuth(obj);
		obj.getBuk().add(bok1);
		
		Session session=sess.openSession();
		session.beginTransaction();
			session.persist(obj);
							session.getTransaction().commit();
				session.close();
	}

}
