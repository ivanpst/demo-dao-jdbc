package Program;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class application {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "bob", "Bob@gmail.com", new Date(), 3000.0, obj) ;
		
		System.out.println(seller);

	}

}
