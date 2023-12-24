package com.winivin.nymble;

import com.winivin.nymble.dataobjects.ActivityImp;
import com.winivin.nymble.dataobjects.DestinationImp;
import com.winivin.nymble.dataobjects.PassengerImp;
import com.winivin.nymble.dataobjects.TravelPackageImp;
import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Destination;
import com.winivin.nymble.interfaces.dataobjects.Passenger;

import java.util.ArrayList;
import java.util.List;

public class TestConstants {

    public ActivityImp activityOne = new ActivityImp(
            "Activity One",
            "Activity One Desc",
            10.0,
            10,
            0
    );

    public ActivityImp activityTwo = new ActivityImp(
            "Activity Two",
            "Activity Two Desc",
            10.0,
            10,
            0
    );

    public ActivityImp activityThree = new ActivityImp(
            "Activity Three",
            "Activity Three Desc",
            10.0,
            10,
            0
    );

    public ActivityImp activityFour = new ActivityImp(
            "Activity Four",
            "Activity Four Desc",
            10.0,
            10,
            0
    );

    List<Activity> activityListOne = new ArrayList<>();
    List<Activity> activityListTwo = new ArrayList<>();

    public DestinationImp destinationOne = new DestinationImp(
            "Destination One",
            null
    );

    public DestinationImp destinationTwo = new DestinationImp(
            "Destination Two",
            null
    );

    List<Destination> travelPackageOneDestinations = new ArrayList<>();

    List<Passenger> travelPackagePassengers = new ArrayList<>();

    public TravelPackageImp travelPackageOne = new TravelPackageImp(
            "Travel Package One",
            20,
            null,
            null
    );

    Passenger passengerOne = new PassengerImp(
            "Passenger One",
            5,
            100.0,
            GlobalConstants.PASSENGER_GOLD_TYPE
    );

    Passenger passengerTwo = new PassengerImp(
            "Passenger Two",
            5,
            100.0,
            GlobalConstants.PASSENGER_GOLD_TYPE
    );

    public TestConstants() {

    }

}
