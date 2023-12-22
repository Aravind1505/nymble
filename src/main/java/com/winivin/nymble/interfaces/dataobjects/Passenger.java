package com.winivin.nymble.interfaces.dataobjects;

import java.util.List;

public interface Passenger {

    public String getName();

    public Integer getNumber();

    public Double getBalance();

    public Integer getType();

    public void setBalance(Double BALANCE);

    public List<Activity> getActivities();

    public void addActivity(Activity activity);

}
