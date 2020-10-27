package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.models.NewsModel;

public interface INewsService {
	List<NewsModel> findByCategoryId(Long categoryId);
	NewsModel save(NewsModel newsModel); //Trả về NewsModel, thêm thông tin vào database
}
