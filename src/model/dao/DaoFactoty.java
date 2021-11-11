package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactoty {
	public static SellerDao createSellerDao() {
		return (SellerDao) new SellerDaoJDBC();
	}
}
