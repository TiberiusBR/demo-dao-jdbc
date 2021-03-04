package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TEST 1 - seller findById");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\nTEST 2 - seller findByDepartment");
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(dep);	
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\nTEST 3 - seller findAll");
		list = sellerDao.findAll();	
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		/*
		System.out.println("\nTEST 4 - seller Insert");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		*/
		
		System.out.println("\nTEST 5 - seller update");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed.");
		
		System.out.println("\nTEST 6 - seller update");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed.");
		
		sc.close();
	}

}
