package com.yship;

import org.apache.catalina.Container;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * @ClassName: app
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/14 8:54
 * @Version: 1.0.0
 */
public class app {
	public static void main(String[] args) {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);
		tomcat.getConnector().setURIEncoding("UTF-8");

		tomcat.addWebapp("", "E:\\code\\c\\hopeschool\\");
		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
