/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slidellrobotics.frc3946.simplefrisbeebot.subsystems;

import com.slidellrobotics.frc3946.simplefrisbeebot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Gustave Abel Michel III
 */
public class FrisbeeWheels extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Talon rearFrisbeeWheel = new Talon(RobotMap.rearFrisbeeMotor);
    Talon frontFrisbeeWheel = new Talon(RobotMap.frontFrisbeeMotor);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void set(double rear, double front) {
        rearFrisbeeWheel.set(rear);
        frontFrisbeeWheel.set(front);
    }
}
