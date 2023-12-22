package com.winivin.nymble.printers;

import com.winivin.nymble.interfaces.dataobjects.TravelPackage;
import com.winivin.nymble.interfaces.dataobjects.Destination;
import com.winivin.nymble.interfaces.printers.DestinationPrinter;
import com.winivin.nymble.interfaces.printers.TravelPackagePrinter;
import jakarta.annotation.Resource;

import java.util.List;

public class TravelPackageItineraryPrinter implements TravelPackagePrinter {

    @Resource(name="destinationPrinterImp")
    DestinationPrinter destinationPrinter;

    @Override
    public void printDetails(TravelPackage travelPackage) {

        System.out.println("Travel Package Name : " + travelPackage);

        List<Destination> destinations = travelPackage.getItinerary();

        for (Destination destination : destinations) {
            destinationPrinter.printDetails(destination);
        }

    }

}
