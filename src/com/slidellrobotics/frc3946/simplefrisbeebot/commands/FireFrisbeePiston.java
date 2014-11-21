/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slidellrobotics.frc3946.simplefrisbeebot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Gustave Abel Michel III
 */
public class FireFrisbeePiston extends CommandGroup {
    
    public FireFrisbeePiston() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        addSequential(new FrisbeePistonExtend(), .25); //should run for 1/4 of a second
        addSequential(new FrisbeePistonRetract(), .1); //Retract for next fire, 
    }
    
    protected void end() { //called when end, or if interrupted
        new FrisbeePistonRetract().start();
    }
}
