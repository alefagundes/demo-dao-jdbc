package apllication;

import java.util.Scanner;

import model.dao.DaoFactoty;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departamentDao = DaoFactoty.createDepartmentDao();
		
		System.out.println("=== Test 1 Department : findById ===");
		Department department  = departamentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== Test 2 Department : insertion ===");
		Department newDep = new Department(null, "Parts");
		departamentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
	}

}
