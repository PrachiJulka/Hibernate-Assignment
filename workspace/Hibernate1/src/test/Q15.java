package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Address;
import Classes.Author;
import Classes.Book;
//Q15 Implement One to One mapping between Author and Book.

public class Q15 {
	public static void main(String[] args){
		SessionFactory sess = new Configuration().configure("/resources/Q15.cfg.xml").buildSessionFactory();
		
	Author obj=new Author();
	obj.setFirstName("Prachi");
	obj.setLastName("Julka");
	obj.setAge(20);
	
	Address adr=new Address();
	adr.setState("Delhi");
	adr.setLocation("Delhi");
	adr.setStreetNumber(12);
	obj.setAdd(adr);
	obj.getSubjects().add("Let us C");
	obj.getSubjects().add("C++");
	obj.getSubjects().add("Java");
	
	
	Book book=new Book();
	book.setBookName("Mathematics");
	 obj.setBook(book);
	Session session=sess.openSession();
	session.beginTransaction();
	session.save(obj);

		session.save(book);
			session.getTransaction().commit();
			session.close();
	}
}
