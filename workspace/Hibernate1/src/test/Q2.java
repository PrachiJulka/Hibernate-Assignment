package test;
//Perform CRUD operation for Author class.
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Classes.AuthorQ2;
import sun.font.CreatedFontTracker;

public class Q2 {

	public static void main(String[] args){
		SessionFactory sess = new Configuration().configure("/resources/Q2.cfg.xml").buildSessionFactory();
		Scanner sc=new Scanner(System.in);
		AuthorQ2 obj=new AuthorQ2();
		obj.setId(1);
		obj.setFirstName("Davi");
		obj.setLastName("Dhawan");
		obj.setDate(new Date());
		
		Session session=sess.openSession();
		session.beginTransaction();
		//System.out.println("Enter id to get detail");
		
		 /*AuthorQ2 auth = (AuthorQ2)session.get(AuthorQ2.class, sc.nextInt());
         System.out.println(auth.getFirstName());
         System.out.println(auth.getLastName());
         System.out.println(auth.getDate());*/
		//session.save(obj);
		//session.update(obj);
         session.delete(obj);
		session.getTransaction().commit();
		}
}
