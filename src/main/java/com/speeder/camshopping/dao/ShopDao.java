package com.speeder.camshopping.dao;

import com.speeder.camshopping.entity.Shop;

public interface ShopDao {

	//����̵�,�������ӵ�����
	int insertShop(Shop shop);
	
	//���µ���
	int updateShop(Shop shop);
}
