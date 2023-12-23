package com.winivin.nymble.passenger;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Passenger;
import com.winivin.nymble.interfaces.finance.AmoutRequired;
import com.winivin.nymble.interfaces.passenger.AddActivityToPassenger;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class AddActivityToPassengerImp implements AddActivityToPassenger {

    @Resource(name="amountRequiredImp")
    AmoutRequired amoutRequired;

    @Override
    public void appendActivity(Passenger passenger, Activity activity) {

        Double activityAmount = amoutRequired.requiredAmount(passenger, activity);
        Double passengerBalance = passenger.getBalance();

        if (passengerBalance > activityAmount) {
            passenger.addActivity(activity);
            passenger.setBalance(passengerBalance - activityAmount);
            activity.increaseOccupancy();
        }
    }

}
