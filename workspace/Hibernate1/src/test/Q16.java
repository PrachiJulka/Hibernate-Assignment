package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Address;
import Classes.Author;
import Classes.Book;
//Q16 Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and without additional table ) and  implement cascade save.
	//Unidirectional
public class Q16 {
	public static void main(String[] args){
		SessionFactory sess = new Configuration().configure("/resources/Q17.cfg.xml").buildSessionFactory();
		Author obj=new Author();
		obj.setFirstName("Evan");
		obj.setLastName("Bayross");
		obj.setAge(20);
		Address adr=new Address();
		adr.setState("Delhi");
		adr.setLocation("Delhi");
		adr.setStreetNumber(11);
		obj.setAdd(adr);
		
		
		Book bok=new Book();
		bok.setBookName("Mathematics");
		obj.getBuk().add(bok);
		
		Book bok1=new Book();
		bok1.setBookName("Science");
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
