package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.ElementCollection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Author;

public class Q4 {
 
	public static void main(String[] args){
		
		SessionFactory sess = new Configuration().configure("/resources/Q4.cfg.xml").buildSessionFactory();
		Scanner sc=new Scanner(System.in);
		List<Author> ls=new ArrayList<Author>();
		Author auth1=new Author();
		auth1.setId(1);
		auth1.setFirstName("Taslima");
		auth1.setLastName("Nasreen");
		auth1.setAge(30);
		auth1.setDate(new Date());
		
		Author auth2=new Author();
		auth2.setId(2);
		auth2.setFirstName("Taslima");
		auth2.setLastName("Nasreen");
		auth2.setAge(30);
		auth2.setDate(new Date());
		
		Author auth3=new Author();
		auth3.setId(3);
		auth3.setFirstName("Taslima");
		auth3.setLastName("Nasreen");
		auth3.setAge(30);
		auth3.setDate(new Date());
		
		Author auth4=new Author();
		auth4.setId(4);
		auth4.setFirstName("Taslima");
		auth4.setLastName("Nasreen");
		auth4.setAge(30);
		auth4.setDate(new Date());
		
		ls.add(auth1);
		ls.add(auth2);
		ls.add(auth3);
		ls.add(auth4);
		
		Session session=sess.openSession();
		session.beginTransaction();
		for(Author ls1:ls)
			session.save(ls1);
				session.getTransaction().commit();
 session.close();
	}
	
}
