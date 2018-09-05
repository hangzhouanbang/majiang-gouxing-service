package com.majiang.gouxing;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.dml.majiang.player.shoupai.gouxing.GouXingCalculator;

@WebListener
public class InitGouxingServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext sc = sce.getServletContext();
		sc.setAttribute("17_3", new GouXingCalculator(17, 3));
		sc.setAttribute("14_4", new GouXingCalculator(14, 4));
	}

	public void contextDestroyed(ServletContextEvent sce) {
	}

}
