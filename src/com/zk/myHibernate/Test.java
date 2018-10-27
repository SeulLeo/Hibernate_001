package com.zk.myHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[]args)
	{
		    Student stu=new Student();
		    stu.setSname("a");
		    stu.setSgrade(1);
		    Configuration cfg=new Configuration().configure();
		    SessionFactory sc = cfg.buildSessionFactory();
		    
		    Session se = sc.openSession();
		    Transaction tx=se.beginTransaction();
		    
		    se.save(stu);
		    tx.commit();
		    System.out.println("success!!!");
	}
}
