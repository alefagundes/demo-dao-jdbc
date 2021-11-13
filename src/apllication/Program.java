package apllication;



import java.util.Date;
import java.text.SimpleDateFormat;
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
		
		System.out.println("\n=== Test 2: seller findDyId =====");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller s : list) {
			System.out.println(s);
		}
		System.out.println("\n=== Test 3: seller findAll =====");
		
		list = sellerDao.findAll();
		for(Seller s : list) {
			System.out.println(s);
		}
		System.out.println("\n=== Test 4: seller insert =====");
		Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== Test 5: seller update =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}
}
