package Ecom.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Ecom.shopingbackend.dao.ProductDAO;
import Ecom.shopingbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class HomeController {
	
	@Autowired
	private ProductDAO productDAO;
	
	
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts() {
		return productDAO.listActiveProducts();
	}
	
	

	@RequestMapping("/admin/all/products")
	@ResponseBody
	public List<Product> getAllProductsForAdmin() {
		
		return productDAO.list();
	}
	
	
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int id) {
		
		
		return productDAO.listActiveProductsByCategory(id);
	}

	
	

}
