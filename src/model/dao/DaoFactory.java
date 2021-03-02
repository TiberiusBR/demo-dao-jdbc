package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() { //Don't expose the implementation
		return new SellerDaoJDBC(DB.getConnection());
	}

}
