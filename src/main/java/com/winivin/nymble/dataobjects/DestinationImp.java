package com.winivin.nymble.dataobjects;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Destination;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DestinationImp implements Destination {

    String NAME;
    List<Activity> ACTIVITIES;

    public DestinationImp(String name, List<Activity> activities) {
        this.NAME = name;
        this.ACTIVITIES = activities;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public List<Activity> getActivities() {
        return ACTIVITIES;
    }
}
