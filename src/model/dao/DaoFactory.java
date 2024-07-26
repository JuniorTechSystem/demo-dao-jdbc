package model.dao;

import db.DB;
import model.dao.impl.SellerDaojDBC;

public class DaoFactory {
	
	public static SellerDao CreateSellerDao() {
		return new SellerDaojDBC(DB.getConnection());
	}

}
