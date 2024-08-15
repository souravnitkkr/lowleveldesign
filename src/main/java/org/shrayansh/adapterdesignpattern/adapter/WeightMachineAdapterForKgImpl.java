package org.shrayansh.adapterdesignpattern.adapter;

import org.shrayansh.adapterdesignpattern.adaptee.WeightMachine;
import org.shrayansh.adapterdesignpattern.adaptee.WeightMachineForBabies;

public class WeightMachineAdapterForKgImpl implements WeightMachineAdapterForKg{

    private WeightMachine weightMachine;

    public WeightMachineAdapterForKgImpl(WeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound=weightMachine.getWeightInPounds();
        return weightInPound * 0.45;
    }
}
