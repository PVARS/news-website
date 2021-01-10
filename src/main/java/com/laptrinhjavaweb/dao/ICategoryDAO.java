package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.models.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll(); //Lấy tất cả thể loại tin tức từ DB
	List<CategoryModel> findUserById();
}
