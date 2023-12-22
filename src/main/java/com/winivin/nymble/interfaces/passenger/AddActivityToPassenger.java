package com.winivin.nymble.interfaces.passenger;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Passenger;

public interface AddActivityToPassenger {

    public void appendActivity(Passenger passenger, Activity activity);

}
