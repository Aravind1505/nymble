package com.winivin.nymble;

import com.winivin.nymble.dataobjects.ActivityImp;
import com.winivin.nymble.dataobjects.DestinationImp;
import com.winivin.nymble.dataobjects.PassengerImp;
import com.winivin.nymble.dataobjects.TravelPackageImp;
import com.winivin.nymble.finance.AmountRequiredImp;
import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Destination;
import com.winivin.nymble.interfaces.dataobjects.Passenger;
import com.winivin.nymble.interfaces.finance.AmoutRequired;
import com.winivin.nymble.interfaces.passenger.AddActivityToPassenger;
import com.winivin.nymble.interfaces.printers.ActivityPrinter;
import com.winivin.nymble.interfaces.printers.DestinationPrinter;
import com.winivin.nymble.interfaces.printers.PassengerPrinter;
import com.winivin.nymble.interfaces.printers.TravelPackagePrinter;
import com.winivin.nymble.passenger.AddActivityToPassengerImp;
import com.winivin.nymble.printers.*;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@TestConfiguration
public class BeanConfigurationTest {

    /**
     * Activity Printer Implementation Bean
     * @return ActivityPrinter
     */
    @Bean
    public ActivityPrinter activityPrinterImp() {
        return new ActivityPrinterImp();
    }

    /**
     * Destination Printer Implementation Bean
     * @return DestinationPrinter
     */
    @Bean
    public DestinationPrinter destinationPrinterImp() {
        return new DestinationPrinterImp();
    }

    /**
     * Passenger Printer Implementation Bean
     * @return PassengerPrinter
     */
    @Bean
    public PassengerPrinter passengerPrinterImp() {
        return new PassengerPrinterImp();
    }

    /**
     * Travel Package Itinerary Printer Bean
     * @return TravelPackagePrinter
     */
    @Bean
    public TravelPackagePrinter travelPackageItineraryPrinter() {
        return new TravelPackageItineraryPrinter();
    }

    /**
     * Travel Package Passenger List Printer Bean
     * @return TravelPackagePrinter
     */
    @Bean
    public TravelPackagePrinter travelPackagePassengerListPrinter() {
        return new TravelPackagePassengerListPrinter();
    }

    /**
     * Amount Required Calculator Bean
     * @return AmoutRequired
     */
    @Bean
    public AmoutRequired amountRequiredImp() {
        return new AmountRequiredImp();
    }

    /**
     * Add Activity To Passenger Bean
     * @return AddActivityToPassenger
     */
    @Bean
    public AddActivityToPassenger addActivityToPassengerImp() {
        return new AddActivityToPassengerImp();
    }

//    Create required test Activities, Travel Packages, Destinations, Passenger beans
    @Bean(name="activityImp")
    public ActivityImp activityImp1() {
        return new ActivityImp("as1", "asf", 10.0, 10, 0);
    }

    @Bean(name="activityImp")
    public ActivityImp activityImp2() {
        return new ActivityImp("as2", "asf", 10.0, 10, 0);
    }

    @Bean(name="destinationImp")
    public DestinationImp destinationImp() {
        List<Activity> activities = new ArrayList<>();
        activities.add(activityImp1());
        activities.add(activityImp2());
        return new DestinationImp("something", activities);
    }

    @Bean(name="passengerImp")
    public PassengerImp passengerImp() {
        return new PassengerImp("asv", 10, 10.0, 1);
    }

    @Bean(name="travelPackageImp")
    public TravelPackageImp travelPackageImp() {
        List<Destination> destinations = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        destinations.add(destinationImp());
        passengers.add(passengerImp());
        return new TravelPackageImp("las", 10, destinations, passengers);
    }
}
