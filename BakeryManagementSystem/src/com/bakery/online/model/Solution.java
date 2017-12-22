package com.bakery.online.model;

import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Solution {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session =sf.openSession();
		session.beginTransaction();
	
		session.close();
	}

}