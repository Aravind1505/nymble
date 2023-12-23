package com.winivin.nymble.printers;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.printers.AvailableActivitiesPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AvailableActivitiesPrinterImp implements AvailableActivitiesPrinter {

    @Override
    public void printActivitiesAvailable(List<Activity> activities) {

        System.out.println(activities.size());

        for (Activity activity : activities) {
            if (activity.getOccupied() < activity.getCapacity()) {
                System.out.print(" Name : " + activity.getName());
                System.out.print(" Capacity : " + activity.getCapacity());
                System.out.print(" Remaining : " + (activity.getCapacity() - activity.getOccupied()));
            }
        }

    }

}
