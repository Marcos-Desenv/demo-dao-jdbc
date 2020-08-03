package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDAO();
		
		System.out.println("TESTE 1 - findById -----------------------------");
		Department department = departmentDao.findById(3);
		
		System.out.println(department);
		
		
		System.out.println("TESTE 2 - findByAll  -----------------------------");
		
		List<Department> list = departmentDao.findAll();
		
		for ( Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("TESTE 3 - INSERT  -----------------------------");
		Department newDepartmet = new Department(null,"Desenv");
		
		departmentDao.insert(newDepartmet);
		System.out.println("NEW Department ID: " + newDepartmet.getId());
		
		System.out.println("TESTE 4 - UPDATE  -----------------------------");
		department = departmentDao.findById(1);
		department.setName("Gotham");
		departmentDao.update(department);
		System.out.println("UPDATED");
		
		System.out.println("TESTE 5 - DELETE  -----------------------------");
		System.out.println("Enter id:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("DELETED");
		
		sc.close();

	}

}
