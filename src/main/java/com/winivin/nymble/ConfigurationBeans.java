package com.winivin.nymble;

import com.winivin.nymble.dataobjects.ActivityImp;
import com.winivin.nymble.dataobjects.DestinationImp;
import com.winivin.nymble.dataobjects.PassengerImp;
import com.winivin.nymble.dataobjects.TravelPackageImp;
import com.winivin.nymble.finance.AmountRequiredImp;
import com.winivin.nymble.passenger.AddActivityToPassengerImp;
import com.winivin.nymble.printers.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.winivin")
public class ConfigurationBeans {

    /**
     * Activity Printer Implementation Bean
     * @return ActivityPrinter
     */
    @Bean(name="activityPrinterImp")
    public ActivityPrinterImp activityPrinterImp() {
        return new ActivityPrinterImp();
    }

    /**
     * Destination Printer Implementation Bean
     * @return DestinationPrinter
     */
    @Bean(name="destinationPrinterImp")
    public DestinationPrinterImp destinationPrinterImp() {
        return new DestinationPrinterImp();
    }

    /**
     * Passenger Printer Implementation Bean
     * @return PassengerPrinter
     */
    @Bean(name="passengerPrinterImp")
    public PassengerPrinterImp passengerPrinterImp() {
        return new PassengerPrinterImp();
    }

    /**
     * Travel Package Itinerary Printer Bean
     * @return TravelPackagePrinter
     */
    @Bean(name="travelPackageItineraryPrinter")
    public TravelPackageItineraryPrinter travelPackageItineraryPrinter() {
        return new TravelPackageItineraryPrinter();
    }

    /**
     * Travel Package Passenger List Printer Bean
     * @return TravelPackagePrinter
     */
    @Bean(name="travelPackagePassengerListPrinter")
    public TravelPackagePassengerListPrinter travelPackagePassengerListPrinter() {
        return new TravelPackagePassengerListPrinter();
    }

    /**
     * Amount Required Calculator Bean
     * @return AmoutRequired
     */
    @Bean(name="amountRequiredImp")
    public AmountRequiredImp amountRequiredImp() {
        return new AmountRequiredImp();
    }

    /**
     * Add Activity To Passenger Bean
     * @return AddActivityToPassenger
     */
    @Bean(name="addActivityToPassengerImp")
    public AddActivityToPassengerImp addActivityToPassengerImp() {
        return new AddActivityToPassengerImp();
    }

    /**
     * Print Available Activities Bean
     * @return AvailableActivitiesPrinter
     */
    @Bean(name="availableActivitiesPrinterImp")
    public AvailableActivitiesPrinterImp availableActivitiesPrinterImp() {
        return new AvailableActivitiesPrinterImp();
    }


//    Create required Activities, Travel Packages, Destinations, Passenger beans
//    @Bean(name="activityImp")
//    public ActivityImp activityImp() {
//        return new ActivityImp("as", "asf", 10.0, 10, 0);
//    }
//
//    @Bean(name="destinationImp")
//    public DestinationImp destinationImp() {
//        return new DestinationImp("something", null);
//    }
//
//    @Bean(name="passengerImp")
//    public PassengerImp passengerImp() {
//        return new PassengerImp("asv", 10, 10.0, 1);
//    }
//
//    @Bean(name="travelPackageImp")
//    public TravelPackageImp travelPackageImp() {
//        return new TravelPackageImp("las", 10, null, null);
//    }

}
