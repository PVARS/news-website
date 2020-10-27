package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.models.CategoryModel;
import com.laptrinhjavaweb.service.ICategoryService;

public class CategoryService implements ICategoryService{

	/*private ICategoryDAO categoryDAO;
	
	public CategoryService() {
		categoryDAO = new CategoryDAO();
	}*/
	
	//Sử dụng Servlet weld
	@Inject
	private ICategoryDAO categoryDAO;
	
	public List<CategoryModel> findAll() {
		// TODO Auto-generated method stub
		return categoryDAO.findAll();
	}

}
