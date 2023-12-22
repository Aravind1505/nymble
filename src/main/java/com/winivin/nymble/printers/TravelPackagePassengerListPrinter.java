package com.winivin.nymble.printers;

import com.winivin.nymble.interfaces.dataobjects.TravelPackage;
import com.winivin.nymble.interfaces.dataobjects.Passenger;
import com.winivin.nymble.interfaces.printers.TravelPackagePrinter;

import java.util.List;

public class TravelPackagePassengerListPrinter implements TravelPackagePrinter {
    @Override
    public void printDetails(TravelPackage travelPackage) {

        List<Passenger> passengers = travelPackage.getPassengers();

        System.out.println("Travel Package Name : " + travelPackage.getName());
        System.out.println("Travel Package Capacity : " + travelPackage.getCapacity());
        System.out.println("Travel Package enrolled passengers : " + passengers.size());

        for (Passenger passenger : passengers) {
            System.out.println("Name : " + passenger.getName() + " Number : " + passenger.getNumber());
        }

    }

}
