package org.shrayansh.adapterdesignpattern.client;

import org.shrayansh.adapterdesignpattern.adaptee.WeightMachineForBabies;
import org.shrayansh.adapterdesignpattern.adapter.WeightMachineAdapterForKg;
import org.shrayansh.adapterdesignpattern.adapter.WeightMachineAdapterForKgImpl;

public class MainDriver {
    public static void main(String[] args) {
        WeightMachineAdapterForKg adapter=new WeightMachineAdapterForKgImpl(new WeightMachineForBabies());
        System.out.println("Weight in kg "+adapter.getWeightInKg());
    }
}
