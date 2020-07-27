package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*Department obj = new Department(1, "Books");
		Seller seller = new Seller(21,"Marcos", "marcos@email.com", new Date(), 3000.0, obj);*/
		
		SellerDAO sellerDao = DaoFactory.createSellerDAO();
		
		System.out.println("TESTE 1 - findById -----------------------------");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
