/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slidellrobotics.frc3946.simplefrisbeebot.subsystems;

import com.slidellrobotics.frc3946.simplefrisbeebot.RobotMap;
import com.slidellrobotics.frc3946.simplefrisbeebot.commands.CompressorOn;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Gustave Abel Michel III
 */
public class PneumaticCompressor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Compressor compressor = new Compressor(RobotMap.compressorPressureSwitch, RobotMap.compressorRelay);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new CompressorOn());
    }
    
    public void start() {
        compressor.start();
    }
    
    public void stop() {
        compressor.stop();
    }
    
    public boolean status() {
        return compressor.enabled();
    }
}
