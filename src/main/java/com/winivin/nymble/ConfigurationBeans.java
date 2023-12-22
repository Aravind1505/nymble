package com.winivin.nymble;

import com.winivin.nymble.finance.AmountRequiredImp;
import com.winivin.nymble.interfaces.finance.AmoutRequired;
import com.winivin.nymble.interfaces.passenger.AddActivityToPassenger;
import com.winivin.nymble.interfaces.printers.ActivityPrinter;
import com.winivin.nymble.interfaces.printers.DestinationPrinter;
import com.winivin.nymble.interfaces.printers.PassengerPrinter;
import com.winivin.nymble.interfaces.printers.TravelPackagePrinter;
import com.winivin.nymble.passenger.AddActivityToPassengerImp;
import com.winivin.nymble.printers.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBeans {

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

}
