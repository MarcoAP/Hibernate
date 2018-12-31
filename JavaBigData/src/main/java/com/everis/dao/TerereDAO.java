package com.everis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.everis.model.TerereModel;

public class TerereDAO {

	private SessionFactory conexao;

	@SuppressWarnings("deprecation")
	public TerereDAO() {
		//ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		conexao = new Configuration().configure().buildSessionFactory();
	}

	public void insertTerere(TerereModel terere) {
		Session session = this.conexao.openSession();
		Transaction t = session.beginTransaction();
		session.save(terere);
		t.commit();
		session.close();
	}

}
