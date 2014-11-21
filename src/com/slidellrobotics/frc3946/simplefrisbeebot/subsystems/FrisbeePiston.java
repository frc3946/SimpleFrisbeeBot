/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slidellrobotics.frc3946.simplefrisbeebot.subsystems;

import com.slidellrobotics.frc3946.simplefrisbeebot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Gustave Abel Michel III
 */
public class FrisbeePiston extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    DoubleSolenoid piston = new DoubleSolenoid(RobotMap.frisbeePistonExtend, RobotMap.frisbeePistonRetract);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void set(DoubleSolenoid.Value value) {
        piston.set(value);
    }
}
