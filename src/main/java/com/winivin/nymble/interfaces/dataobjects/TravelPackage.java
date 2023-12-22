package com.winivin.nymble.interfaces.dataobjects;

import java.util.List;

public interface TravelPackage {

    public String getName();

    public Integer getCapacity();

    public List<Destination> getItinerary();

    public List<Passenger> getPassengers();

}
