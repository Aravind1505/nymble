package com.winivin.nymble.dataobjects;

import com.winivin.nymble.interfaces.dataobjects.Destination;
import com.winivin.nymble.interfaces.dataobjects.Passenger;
import com.winivin.nymble.interfaces.dataobjects.TravelPackage;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TravelPackageImp implements TravelPackage {

    private final String NAME;
    private final Integer CAPACITY;
    private final List<Destination> ITINERARY;
    private final List<Passenger> PASSENGERS;

    public TravelPackageImp(String name, Integer capacity, List<Destination> itinerary, List<Passenger> passengers) {

        this.NAME = name;
        this.CAPACITY = capacity;
        this.ITINERARY = itinerary;
        this.PASSENGERS = passengers;

    }

    @Override
    public String getName() {
        return this.NAME;
    }

    @Override
    public Integer getCapacity() {
        return this.CAPACITY;
    }

    @Override
    public List<Destination> getItinerary() {
        return this.ITINERARY;
    }

    @Override
    public List<Passenger> getPassengers() {
        return this.PASSENGERS;
    }

}
