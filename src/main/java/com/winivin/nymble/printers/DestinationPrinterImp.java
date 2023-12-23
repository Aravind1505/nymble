package com.winivin.nymble.printers;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Destination;
import com.winivin.nymble.interfaces.printers.ActivityPrinter;
import com.winivin.nymble.interfaces.printers.DestinationPrinter;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DestinationPrinterImp implements DestinationPrinter {

    @Resource(name="activityPrinterImp")
    ActivityPrinter activityPrinter;

    @Override
    public void printDetails(Destination destination) {
        System.out.println("Destination : " + destination.getName());

        List<Activity> activities = destination.getActivities();

        for (Activity activity : activities) {
            activityPrinter.printDetails(activity);
        }

    }

}
