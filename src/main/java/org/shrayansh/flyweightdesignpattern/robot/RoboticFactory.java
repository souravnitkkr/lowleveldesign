package org.shrayansh.flyweightdesignpattern.robot;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static Map<String, IRobot> roboticObjectCache=new HashMap<>();

    public static IRobot createRobot(String robotType){
        if(roboticObjectCache.containsKey(robotType)) {
            System.out.println(robotType+  " data fetched from cache");
            return roboticObjectCache.get(robotType);
        }
        else{
            if(robotType.equals("HUMANOID")){
                Sprite humanoidSprite = new Sprite();
                IRobot humanoidRobot=new HumanoidRobot(robotType,humanoidSprite);
                roboticObjectCache.put(robotType,humanoidRobot);
                return humanoidRobot;
            }else if(robotType.equals("ROBOTICDOG")){
                Sprite dogSprite=new Sprite();
                IRobot dogRobot=new RoboticDog(robotType,dogSprite);
                roboticObjectCache.put(robotType,dogRobot);
                return dogRobot;
            }
        }
        return null;
    }
}
