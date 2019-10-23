package com.speeder.camshopping.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.speeder.camshopping.BaseTest;
import com.speeder.camshopping.entity.Area;

public class AreaDaoTest extends BaseTest {
	
	@Autowired(required=true)
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea() {
		List<Area> areaList = areaDao.queryArea();
		assertEquals(2, areaList.size());
	}
}
