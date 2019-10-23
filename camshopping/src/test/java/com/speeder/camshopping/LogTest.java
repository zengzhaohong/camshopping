package com.speeder.camshopping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	
	public static Logger LOGGER = LoggerFactory.getLogger(LogTest.class);
	public static void main(String[] args) {
		
		LOGGER.debug("DEBUG TEST");
		LOGGER.info("info test");
		LOGGER.error("ERROR TEST");
	}
}
