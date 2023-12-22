package com.winivin.nymble;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NymbleApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext beanFactory = new AnnotationConfigApplicationContext(ConfigurationBeans.class);

	}

}
