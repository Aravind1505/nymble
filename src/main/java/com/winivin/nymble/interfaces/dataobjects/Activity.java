package com.winivin.nymble.interfaces.dataobjects;

public interface Activity {

    public String getName();

    public String getDescription();

    public Double getCost();

    public Integer getCapacity();

    public Destination getDestination();

    public Integer getOccupied();

    public void increaseOccupancy();

    public void setDestination(Destination destination);

}
