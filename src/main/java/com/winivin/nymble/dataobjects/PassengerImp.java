package com.winivin.nymble.dataobjects;

import com.winivin.nymble.interfaces.dataobjects.Activity;
import com.winivin.nymble.interfaces.dataobjects.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerImp implements  Passenger{

    private final String NAME;
    private final Integer NUMBER;
    private Double BALANCE;
    private final Integer TYPE;
    private final List<Activity> ACTIVITIES;

    public PassengerImp(String name, Integer number, Double balance, Integer type) {
        this.NAME = name;
        this.NUMBER = number;
        this.BALANCE = balance;
        this.TYPE = type;

        this.ACTIVITIES = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.NAME;
    }

    @Override
    public Integer getNumber() {
        return this.NUMBER;
    }

    @Override
    public Double getBalance() {
        return this.BALANCE;
    }

    @Override
    public Integer getType() {
        return this.TYPE;
    }

    @Override
    public void setBalance(Double BALANCE) {
        this.BALANCE = BALANCE;
    }

    @Override
    public List<Activity> getActivities() {
        return this.ACTIVITIES;
    }

    @Override
    public void addActivity(Activity activity) {
        this.ACTIVITIES.add(activity);
    }

}
