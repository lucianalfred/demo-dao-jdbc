package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
	
		
	
		System.out.println("====Test 1:findById=======================");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller  = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("=================================");
		
		System.out.println("====Test 2: findByDepartment=======================");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		System.out.println("Total Sellers: "+list.size());
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("=================================");
		
		System.out.println("====Test 3:findAll=======================");
		list = sellerDao.findAll();
		System.out.println("Total Sellers: "+list.size());
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("=================================");
		
		System.out.println("====Test 4:seller insert=======================");
		
		/*Seller newSeller  = new Seller(null, "Banana Joe", "joeThebananag@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inseted new id = "+newSeller.getId());
		
		*/
		System.out.println("=================================");
		
        System.out.println("====Test 5:seller update=======================");
        seller = sellerDao.findById(7);
		seller.setName("Luciano Alfredo");
		sellerDao.update(seller);
		System.out.println("Updated completed");
        System.out.println("=================================");
	
	}
}
