package apllication;

import java.util.List;

import model.dao.DaoFactoty;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactoty.createSellerDao();
		
		System.out.println("=== Test 1: seller findDyId =====");
		
		Seller seller = sellerDao.findById(3);
	
		System.out.println(seller);
		
		System.out.println("\n=== Test 1: seller findDyId =====");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller s : list) {
			System.out.println(s);
		}
	}
}
