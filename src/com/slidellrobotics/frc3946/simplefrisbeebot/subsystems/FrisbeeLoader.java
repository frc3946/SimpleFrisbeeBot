/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slidellrobotics.frc3946.simplefrisbeebot.subsystems;

import com.slidellrobotics.frc3946.simplefrisbeebot.RobotMap;
import com.slidellrobotics.frc3946.simplefrisbeebot.commands.LoadFrisbeeStop;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Gustave Abel Michel III
 */
public class FrisbeeLoader extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Relay loadFrisbeeMotor = new Relay(RobotMap.loadFrisbeeRelay);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new LoadFrisbeeStop());
    }
    
    public void set(Relay.Value value) {
        loadFrisbeeMotor.set(value);
    }
}
