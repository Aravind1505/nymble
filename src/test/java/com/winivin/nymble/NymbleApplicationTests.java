package com.winivin.nymble;

import com.winivin.nymble.dataobjects.TravelPackageImp;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ContextConfiguration(classes = {BeanConfigurationTest.class})
class NymbleApplicationTests {

	NymbleApplication nymbleApplication;
	TestConstants testConstants;

	@Resource(name="travelPackageImp")
	TravelPackageImp travelPackageImp;

	@BeforeAll
	public void init() {

		nymbleApplication = new NymbleApplication();
		testConstants = new TestConstants();
	}

	@Test
	void contextLoads() {
		System.out.println(travelPackageImp);
	}

}
