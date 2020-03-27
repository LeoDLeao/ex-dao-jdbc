package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 01: department findById ====");

		Department dep = departmentDao.findById(2);

		System.out.println(dep);
		
		System.out.println("\n=== TEST 02: department findAll ====");
		
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 03: department Insert ====");
		
		Department dp1 = new Department(null, "Music");
		departmentDao.insert(dp1);
		
		System.out.println("Insertio complete! new id: " + dp1.getId());
		
		System.out.println("\n=== TEST 4: department Update ====");
		
		dep = departmentDao.findById(6);
		dep.setName("Trumpets");
		departmentDao.update(dep);
		
		System.out.println("Update completed! ");
		
		System.out.println("\n=== TEST 5: department Delete ====");
		
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete! ");
		
		
		
		
		
		
		sc.close();

	}

}
