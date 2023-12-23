package com.winivin.nymble.finance;

import com.winivin.nymble.interfaces.finance.AmoutRequired;
import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Passenger;
import org.springframework.stereotype.Component;

import static com.winivin.nymble.GlobalConstants.PASSENGER_GOLD_TYPE;
import static com.winivin.nymble.GlobalConstants.PASSENGER_STANDARD_TYPE;
import static com.winivin.nymble.GlobalConstants.PASSENGER_PREMIUM_TYPE;

@Component
public class AmountRequiredImp implements AmoutRequired {

    @Override
    public Double requiredAmount(Passenger passenger, Activity activity) {

        Integer passengerType = passenger.getType();
        Double amount = null;

        if (passengerType.equals(PASSENGER_STANDARD_TYPE)) {
            amount = activity.getCost();
        } else if (passengerType.equals(PASSENGER_GOLD_TYPE)) {
            amount = 0.9 * activity.getCost();
        } else if (passengerType.equals(PASSENGER_PREMIUM_TYPE)) {
            amount = 0.0;
        }

        return amount;
    }

}
