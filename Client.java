//Client.java

import org.hibernate.*;
import org.hibernate.cfg.*;
public class Client
{
	public static void main(String ...args)
	{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Student student=new Student();
		student.setStudentId(12);
		student.setStudentName("VASAVI");
		student.setCourse("DOTNET");
		student.setMarks(88);
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
		System.out.println("Object Saved Successfullly");
		session.close();
		factory.close();
		
		///This is just for the update or doing testing of ghithub
		// Please let me know if you have any questions
		//Akash--Last edited 06/15/2018
		
	}
}
