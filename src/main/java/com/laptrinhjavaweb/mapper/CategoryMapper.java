package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;

import com.laptrinhjavaweb.models.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel>{

	public CategoryModel mapRow(ResultSet resultSet) {
		try {
			CategoryModel category = new CategoryModel();
			category.setId(resultSet.getLong("id"));
			category.setName(resultSet.getString("name"));
			category.setCode(resultSet.getString("code"));
			return category;
		} catch (Exception e) {
			return null;
		}
	}
}
