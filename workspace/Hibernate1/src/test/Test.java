package test;
import java.text.SimpleDateFormat;
//Perform CRUD operation for Author class.
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.Author;
import Classes.AuthorQ2;
import sun.font.CreatedFontTracker;
//Q3 Use hbm2ddl create to introduce Date of Birth for Author.
public class Test {

	public static void main(String[] args){
		SessionFactory sess = new Configuration().configure("/resources/Hibernate.cfg.xml").buildSessionFactory();
		//Scanner sc=new Scanner(System.in);
		Author obj=new Author();
		obj.setId(5);
		obj.setFirstName("Davi");
		obj.setLastName("Dhawan");
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		String dateString = "24-08-2010";
		try{
		Date date = format.parse(dateString);
		obj.setDateOfBirth(date);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Session session=sess.openSession();
		session.beginTransaction();
		
		session.save(obj);
		
		session.getTransaction().commit();
		}
}
