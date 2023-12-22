package com.winivin.nymble.dataobjects;

import com.winivin.nymble.interfaces.dataobjects.Activity;

public class ActivityImp implements Activity {

    private final String NAME;
    private final String DESCRIPTION;
    private final Double COST;
    private final Integer CAPACITY;
    private final String DESTINATION;

    public ActivityImp(String name, String description, Double cost, Integer capacity, String destination) {
        this.NAME = name;
        this.DESCRIPTION = description;
        this.COST = cost;
        this.CAPACITY = capacity;
        this.DESTINATION = destination;
    }

    @Override
    public String getName() {
        return this.NAME;
    }

    @Override
    public String getDescription() {
        return this.DESCRIPTION;
    }

    @Override
    public Double getCost() {
        return this.COST;
    }

    @Override
    public Integer getCapacity() {
        return this.CAPACITY;
    }

    @Override
    public String getDestination() {
        return this.DESTINATION;
    }

}
