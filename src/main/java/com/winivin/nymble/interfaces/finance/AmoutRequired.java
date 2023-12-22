package com.winivin.nymble.interfaces.finance;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Passenger;

public interface AmoutRequired {

    public Double requiredAmount(Passenger passenger, Activity activity);

}
