package com.speeder.camshopping.dao;

import com.speeder.camshopping.entity.Shop;

public interface ShopDao {

	//添加商店,返回增加的条数
	int insertShop(Shop shop);
}
