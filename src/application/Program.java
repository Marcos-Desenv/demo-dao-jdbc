package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
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

	}

}
