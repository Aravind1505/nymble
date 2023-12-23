package com.winivin.nymble.dataobjects;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Destination;
import org.springframework.stereotype.Component;

@Component
public class ActivityImp implements Activity {

    private final String NAME;
    private final String DESCRIPTION;
    private final Double COST;
    private final Integer CAPACITY;
    private Destination DESTINATION;
    private Integer OCCUPIED;

    public ActivityImp(String name, String description, Double cost, Integer capacity, Integer occupied) {
        this.NAME = name;
        this.DESCRIPTION = description;
        this.COST = cost;
        this.CAPACITY = capacity;
        this.OCCUPIED = occupied;
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
    public Destination getDestination() {
        return this.DESTINATION;
    }

    @Override
    public void setDestination(Destination destination) {
        this.DESTINATION = destination;
    }

    @Override
    public Integer getOccupied() {
        return this.OCCUPIED;
    }

    @Override
    public void increaseOccupancy() {
        if (this.getOccupied() < this.getCapacity()) {
            this.OCCUPIED = this.OCCUPIED + 1;
        }
    }

}
