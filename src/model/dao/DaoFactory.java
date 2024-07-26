package model.dao;

import model.dao.impl.SellerDaojDBC;

public class DaoFactory {
	
	public static SellerDao CreateSellerDao() {
		return new SellerDaojDBC();
	}

}
