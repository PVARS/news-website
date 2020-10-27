package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.models.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	public List<CategoryModel> findAll() {	
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
		
//		List<CategoryModel> results = new ArrayList<CategoryModel>();
//		String sql = "SELECT * FROM category";
//		Connection connection = getConnection();
//		PreparedStatement statement = null;
//		ResultSet resultSet = null;
//		// Chỉ query dữ liệu khi Connect khác null
//		if (connection != null) {
//			try {
//				statement = connection.prepareStatement(sql);
//				resultSet = statement.executeQuery();
//				while (resultSet.next()) {
//					CategoryModel category = new CategoryModel();
//					category.setId(resultSet.getLong("id"));
//					category.setName(resultSet.getString("name"));
//					category.setCode(resultSet.getString("code"));
//					results.add(category);
//				}
//				return results;
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				try {
//					// Đóng tất cả sau khi chạy xong
//					if (connection != null) {
//						connection.close();
//					}
//					if (statement != null) {
//						statement.close();
//					}
//					if (resultSet != null) {
//						resultSet.close();
//					}
//				} catch (Exception e2) {
//					e2.printStackTrace();
//				}
//			}
//		}
//		return null;
	}

}
