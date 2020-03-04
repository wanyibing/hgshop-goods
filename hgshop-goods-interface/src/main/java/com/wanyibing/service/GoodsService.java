package com.wanyibing.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wanyibing.entity.Brand;
import com.wanyibing.entity.Category;

/**
 * 
 * @author 万一兵
 * Dobbo  服务接口函数比要有非void 的返回值
 * 
 */
public interface GoodsService {

	int addBrand(Brand brand);
	
	int updateBrand(Brand brand);
	
	int deleteBrand(Integer id);
	/**
	 * 
	 * @param firstChar 首字母
	 * @return
	 */
	PageInfo<Brand> listBrand(String firstChar,int page);
	
	
	int addCategory(Category category);
	
	int updateCategory(Category category);
	
	int deleteCategory(Integer id);
	/**
	 * 
	 * @param firstChar 首字母
	 * @param page	页码
	 * @return
	 */
	PageInfo<Category> listCategory(String firstChar,int page);	
	
	List<Category> treeCategory();
	
	
}
