package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.models.NewsModel;

public interface INewsDAO extends GenericDAO<NewsModel>{
	List<NewsModel> findByCategoryId(Long categoryId); //Lấy tất cả bài viết tin tức từ DB theo thể loại
	Long save(NewsModel newsModel); //Trả về kiểu dữ liệu của id bài viết
	Long update(NewsModel newsModel);
}
