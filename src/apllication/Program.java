package apllication;

import model.dao.DaoFactoty;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactoty.createSellerDao();
		
		System.out.println("=== Test 1: seller findDyId =====");
		
		Seller seller = sellerDao.findById(3);
		
		
		System.out.println(seller);
	}
}
