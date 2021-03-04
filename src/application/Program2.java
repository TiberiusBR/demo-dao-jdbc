package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("TEST 1 - department findById");
		Department dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\nTEST 2 - department findAll");
		List<Department> list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
//		System.out.println("\nTEST 3 - department insert");
//		Department dep1 = new Department(null, "Test");
//		depDao.insert(dep1);
//		System.out.println("Success!");
		
		System.out.println("\nTEST 4 - department update");
		Department depUp = depDao.findById(7);
		depUp.setName("Favela");
		depDao.update(depUp);
		System.out.println("Successfully Updated!");
		
		System.out.println("\nTEST 5 - department delete");
		depDao.deleteById(7);
		System.out.println("Successfully Deleted!");
		
		
		

	}

}
