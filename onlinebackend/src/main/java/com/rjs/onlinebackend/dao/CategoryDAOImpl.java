package com.rjs.onlinebackend.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rjs.onlinebackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categeries = new ArrayList<>();
	
	static {
		Category category =new Category();
		
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("is tv");
		category.setImageURL("rajesh.jpg");
		category.setActive(true);
		categeries.add(category);
		
category =new Category();
		
		category.setId(2);
		category.setName("laptop");
		category.setDescription("is laptop");
		category.setImageURL("laptop.jpg");
		category.setActive(true);
		categeries.add(category);
		
		
category =new Category();
		
		category.setId(3);
		category.setName("mobile");
		category.setDescription("is mobile");
		category.setImageURL("mobile.jpg");
		category.setActive(true);
		categeries.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categeries;
	}

	@Override
	public Category get(int id) {
		for(Category category : categeries) {
			if(category.getId() == id) return category;
		}
		return null;
	}

}
