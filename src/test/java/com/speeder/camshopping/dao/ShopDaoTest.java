package com.speeder.camshopping.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.speeder.camshopping.BaseTest;
import com.speeder.camshopping.entity.Area;
import com.speeder.camshopping.entity.PersonInfo;
import com.speeder.camshopping.entity.Shop;
import com.speeder.camshopping.entity.ShopCategory;

public class ShopDaoTest extends BaseTest {
	@Autowired
	private ShopDao shopDao;

	@Test
	public void testInsertShop() {
		Shop shop = new Shop();
		Area area = new Area();
		PersonInfo owner = new PersonInfo();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setShopName("≤‚ ‘");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("test");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setAdvice("…Û∫À÷–");
		shop.setEnableStatus(0);
		int effectedNum = shopDao.insertShop(shop);
		assertEquals(1,effectedNum);
		
	}

}
