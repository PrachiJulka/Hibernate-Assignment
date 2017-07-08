package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Address;
import Classes.Author;
//Persist 3 subjects for each author.
public class Q13 {
	public static void main(String[] args){
		SessionFactory sess = new Configuration().configure("/resources/Hibernate.cfg.xml").buildSessionFactory();
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		
		Author obj=new Author();
		obj.setFirstName("Aggarwal");
		obj.setAge(60);
		try{
			Date date = format.parse("24-08-1983");
			obj.setdateOfBirth(date);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		Address adr=new Address();
		adr.setState("Delhi");
		adr.setLocation("Delhi");
		adr.setStreetNumber(12);
		obj.setAdd(adr);
		obj.getSubjects().add("Let us C");
		obj.getSubjects().add("C++");
		obj.getSubjects().add("Java");
		
		
		Author auth1=new Author();
		auth1.setFirstName("Evan");
		auth1.setAge(60);
		Address adr1=new Address();
		adr1.setState("Delhi");
		adr1.setLocation("Delhi");
		adr1.setStreetNumber(12);
		auth1.setAdd(adr);
		auth1.getSubjects().add("Let us C");
		auth1.getSubjects().add("C++");
		auth1.getSubjects().add("Java");
		try{
			Date date = format.parse("26-08-1983");
			auth1.setdateOfBirth(date);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
		
		Author auth2=new Author();
		auth2.setFirstName("R.S Agarwal");
		auth2.setAge(20);
		Address adr2=new Address();
		adr2.setState("Delhi");
		adr2.setLocation("Delhi");
		adr2.setStreetNumber(12);
		auth2.setAdd(adr);
		auth2.getSubjects().add("Let us C");
		auth2.getSubjects().add("C++");
		auth2.getSubjects().add("Java");
		try{
			Date date = format.parse("29-08-1983");
			auth2.setdateOfBirth(date);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
		
		Session session=sess.openSession();
		session.beginTransaction();
		session.persist(obj);
		session.persist(auth1);
		session.persist(auth2);
		session.getTransaction().commit();
		session.close();
	}

}
