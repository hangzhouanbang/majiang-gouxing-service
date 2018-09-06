package com.majiang.gouxing;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.dml.majiang.player.shoupai.gouxing.GouXingCalculator;
import com.dml.majiang.player.shoupai.gouxing.GouXingCalculatorHelper;

@WebListener
public class InitGouxingServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		GouXingCalculatorHelper.gouXingCalculator = new GouXingCalculator(17, 4);
	}

	public void contextDestroyed(ServletContextEvent sce) {
	}

}
