package com.winivin.nymble;

import com.winivin.nymble.dataobjects.TravelPackageImp;
import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.TravelPackage;
import com.winivin.nymble.interfaces.printers.AvailableActivitiesPrinter;
import com.winivin.nymble.interfaces.printers.PassengerPrinter;
import com.winivin.nymble.interfaces.printers.TravelPackagePrinter;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class NymbleApplication {

	@Resource(name="travelPackageItineraryPrinter")
	TravelPackagePrinter travelPackageItineraryPrinter;

	@Resource(name="travelPackagePassengerListPrinter")
	TravelPackagePrinter travelPackagePassengerListPrinter;

	@Resource(name="passengerPrinterImp")
	PassengerPrinter passengerPrinter;

	@Resource(name="availableActivitiesPrinterImp")
	AvailableActivitiesPrinter availableActivitiesPrinter;

	@Autowired
	List<Activity> activities;

	public static void main(String[] args) {

		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(ConfigurationBeans.class);

	}
}
