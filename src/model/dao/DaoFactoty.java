package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactoty {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
