package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import example.entity.Course;

public class Hibernate_CRUD_Example 
{

	public static void create() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Course crs=new Course("HB","Hibernate",10,12000);
		session.save(crs);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Successful.....");
		
	}
	public static void main(String[] args) 
	{
		
		create();

	}

}
