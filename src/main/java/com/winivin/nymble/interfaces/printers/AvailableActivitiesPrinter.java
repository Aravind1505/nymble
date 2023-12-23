package com.winivin.nymble.interfaces.printers;

import com.winivin.nymble.interfaces.dataobjects.Activity;

import java.util.List;

public interface AvailableActivitiesPrinter {

    public void printActivitiesAvailable(List<Activity> activities);

}
