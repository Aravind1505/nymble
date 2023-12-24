package com.winivin.nymble.finance;

import com.winivin.nymble.GlobalConstants;
import com.winivin.nymble.dataobjects.ActivityImp;
import com.winivin.nymble.dataobjects.PassengerImp;
import com.winivin.nymble.interfaces.dataobjects.Passenger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AmountRequiredImpTest {

    public ActivityImp activityOne = new ActivityImp(
            "Activity One",
            "Activity One Desc",
            10.0,
            10,
            0
    );

    Passenger passengerOne = new PassengerImp(
            "Passenger One",
            5,
            100.0,
            GlobalConstants.PASSENGER_STANDARD_TYPE
    );

    @Autowired
    AmountRequiredImp amountRequiredImp;

    @Test
    public void testRequiredAmount() {
        double required = amountRequiredImp.requiredAmount(passengerOne, activityOne);
        Assertions.assertEquals(10.0, required);
    }

}
