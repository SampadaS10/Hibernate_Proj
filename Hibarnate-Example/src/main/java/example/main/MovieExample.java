package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Movie;
import example.utilities.HibernateUtil;

public class MovieExample 
{

	public static void create()
	{
		SessionFactory sf=HibernateUtil.buildSessionFactory();
		Session s=sf.openSession();
		Movie m1=new Movie("M2","3idiots","Comedy",2004);
		Transaction tx=s.beginTransaction();
		s.save(m1);
		tx.commit();
		sf.close();
		s.close();
		System.out.println("Successfully Created..");
	
		
	}
	public static void select()
	{
		
	}
	public static void main(String[] args) 
	{
		create();

	}

}
