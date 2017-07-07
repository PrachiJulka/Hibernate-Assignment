package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.ElementCollection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Author;

//Use hbm2dll update to insert at least 4 records for Author.

public class Q4 {
 
	public static void main(String[] args){
		
		SessionFactory sess = new Configuration().configure("/resources/Q4.cfg.xml").buildSessionFactory();
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		List<Author> ls=new ArrayList<Author>();
		Author auth1=new Author();
		auth1.setId(1);
		auth1.setFirstName("Yashwant");
		auth1.setLastName("Kanettkar");
		auth1.setAge(30);
		try{
		Date date = format.parse("24-08-1983");
		auth1.setDateOfBirth(date);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		Author auth2=new Author();
		auth2.setId(2);
		auth2.setFirstName("Katthy");
		auth2.setLastName("Sierra");
		auth2.setAge(30);
		try{
		Date date = format.parse("12-08-1880");
		auth2.setDateOfBirth(date);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		Author auth3=new Author();
		auth3.setId(3);
		auth3.setFirstName("R.S");
		auth3.setLastName("Salaria");
		auth3.setAge(30);
		try{
			Date date = format.parse("14-08-1880");
			auth3.setDateOfBirth(date);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		Author auth4=new Author();
		auth4.setId(4);
		auth4.setFirstName("Taslima");
		auth4.setLastName("Nasreen");
		auth4.setAge(30);
		try{
			Date date = format.parse("12-09-1880");
			auth4.setDateOfBirth(date);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
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
