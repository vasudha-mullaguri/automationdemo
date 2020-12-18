package com.yatra.utils;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.yatra.constants.Constant;



public class Logreports {
	Logger logger = null;

	public Logreports() {
		getLogger();
		logger = Logger.getLogger(Logreports.class.getName());

	}

	public void getLogger() {

		PropertyConfigurator.configure(Constant.LOG4J_FILE);
	}

	public void info(String message) {
		logger.info(message);
	}
}


