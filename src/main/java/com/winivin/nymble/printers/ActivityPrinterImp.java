package com.winivin.nymble.printers;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.printers.ActivityPrinter;
import org.springframework.stereotype.Component;

@Component
public class ActivityPrinterImp implements ActivityPrinter {
    @Override
    public void printDetails(Activity activity) {

        System.out.println("Activity Name : " + activity.getName());
        System.out.println("Activity Description : " + activity.getDescription());
        System.out.println("Activity Cost : " + activity.getCost());
        System.out.println("Activity Capacity : " + activity.getCapacity());

    }
}
