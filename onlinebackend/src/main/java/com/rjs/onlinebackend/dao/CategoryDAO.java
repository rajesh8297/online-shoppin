package com.rjs.onlinebackend.dao;

import java.util.List;

import com.rjs.onlinebackend.dto.Category;

public interface CategoryDAO {
	
	public List<Category> list();
	public Category get(int id);

}
