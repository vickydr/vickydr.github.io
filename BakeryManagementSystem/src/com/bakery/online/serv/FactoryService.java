package com.bakery.online.serv;



import org.hibernate.SessionFactory;

import com.bakery.online.util.HBFactory;

public class FactoryService {
	protected SessionFactory factory;

	public FactoryService() {
		super();
		this.factory = HBFactory.get();
	}

	public SessionFactory get() {
		return factory;
	}

}
