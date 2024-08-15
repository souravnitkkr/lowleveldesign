package org.shrayansh.parkinglotmedium;

import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpotType;
import java.util.HashMap;
import java.util.Map;

public class HourlyCost {
    private Map<ParkingSpotType,Integer> hourCost;

    HourlyCost(){
        hourCost=new HashMap<>();
        hourCost.put(ParkingSpotType.FOUR_WHEELER,50);
        hourCost.put(ParkingSpotType.TWO_WHEELER,30);
    }

    public int getHourlyCost(ParkingSpotType parkingSpotType) throws Exception {
        if(!hourCost.containsKey(parkingSpotType)){
            throw new Exception("Parking Spot of this type vehicle does not exists");
        }
        return hourCost.get(parkingSpotType);
    }
}
