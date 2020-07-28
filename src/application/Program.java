package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Department obj = new Department(1, "Books");
		Seller seller = new Seller(21,"Marcos", "marcos@email.com", new Date(), 3000.0, obj);*/
		
		SellerDAO sellerDao = DaoFactory.createSellerDAO();
		
		System.out.println("TESTE 1 - findById -----------------------------");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("TESTE 2 - findByDepartment -----------------------------");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for ( Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("TESTE 3 - findByAll  -----------------------------");

		list = sellerDao.findAll();
		
		for ( Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("TESTE 4 - INSERT  -----------------------------");
		Seller newSeller = new Seller(null,"Heloisa","heloisa@email.com",new Date(),4000.0,dep);
		
		sellerDao.insert(newSeller);
		System.out.println("NEW SELLER ID: " + newSeller.getId());
		
		System.out.println("TESTE 5 - UPDATE  -----------------------------");
		seller = sellerDao.findById(1);
		seller.setName("Bruce Wayne");
		sellerDao.update(seller);
		System.out.println("UPDATED");
		
		System.out.println("TESTE 6 - DELETE  -----------------------------");
		System.out.println("Enter id:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("DELETED");
		
		sc.close();
		

	}

}
