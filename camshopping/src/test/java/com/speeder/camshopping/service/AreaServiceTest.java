package com.speeder.camshopping.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.speeder.camshopping.BaseTest;
import com.speeder.camshopping.entity.Area;

public class AreaServiceTest extends BaseTest{

	Logger log = LoggerFactory.getLogger(AreaServiceTest.class);
	
	@Autowired
	public AreaService areaService;
	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		assertEquals(2,areaList.size());
		log.info("test log");
		log.error("error log");
	}
}
