package com.speeder.camshopping.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
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
	//Ignore标签忽略被标记的部分
	@Ignore
	public void testInsertShop() throws Exception {
		Shop shop = new Shop();
		Area area = new Area();
		PersonInfo owner = new PersonInfo();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("test");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setAdvice("审核中");
		shop.setEnableStatus(0);
		int effectedNum = shopDao.insertShop(shop);
		assertEquals(1, effectedNum);
		// System.out.println(area.areaId);

		// System.out.println(owner.userId);
	}

	@Test
	public void updateShop() throws Exception{
		Shop shop = new Shop();
		shop.setShopId(14L);
		shop.setShopDesc("测试商店描述");
		shop.setShopName("咖啡");
		shop.setLastEditTime(new Date());
		int effecteNum = shopDao.updateShop(shop);
		assertEquals(1,effecteNum);
		
	}
}
