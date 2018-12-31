package com.everis.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateController {
	
	private final SessionFactory factory;

	public HibernateController() {
		this.factory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	public Session getSession() {
		return this.factory.openSession();
	}
}
