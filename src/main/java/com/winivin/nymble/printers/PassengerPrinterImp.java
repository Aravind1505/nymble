package com.winivin.nymble.printers;

import com.winivin.nymble.interfaces.finance.AmoutRequired;
import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Passenger;
import com.winivin.nymble.interfaces.printers.PassengerPrinter;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassengerPrinterImp implements PassengerPrinter {

    @Resource(name="amountRequiredImp")
    AmoutRequired amoutRequired;

    @Override
    public void printDetails(Passenger passenger) {

        System.out.println("Passenger Name : " + passenger.getName());
        System.out.println("Passenger Number : " + passenger.getNumber());
        System.out.println("Passenger Balance : " + passenger.getBalance());
        System.out.println("Passenger Activities : ");

        List<Activity> activities = passenger.getActivities();

        for (Activity activity : activities) {
            System.out.println("Activity Name : " + activity.getName());
            System.out.println("Activity Destination : " + activity.getDestination());
            System.out.println("Activity Cost Paid : " + amoutRequired.requiredAmount(passenger, activity));
        }

    }

}
