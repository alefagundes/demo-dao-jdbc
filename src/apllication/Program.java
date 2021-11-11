package apllication;

import java.util.Date;

import model.dao.DaoFactoty;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Date hj = new Date();
		
		Department obj = new Department(1, "books");
		
		SellerDao sellerdao = DaoFactoty.createSellerDao();
	}

}
