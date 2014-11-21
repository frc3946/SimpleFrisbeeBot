/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slidellrobotics.frc3946.simplefrisbeebot.commands;

import edu.wpi.first.wpilibj.Relay;

/**
 *
 * @author Gustave Abel Michel III
 */
public class LoadFrisbeeOut extends CommandBase {
    
    public LoadFrisbeeOut() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(frisbeeLoader);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        frisbeeLoader.set(Relay.Value.kReverse);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
