package com.slidellrobotics.frc3946.simplefrisbeebot.commands;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author bradmiller
 */
public class TankDriveWithJoysticks extends CommandBase {

    public TankDriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.tankDrive(
                oi.leftJoystick.getAxis(Joystick.AxisType.kX),
                oi.rightJoystick.getAxis(Joystick.AxisType.kX)
        );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; //runs until interrupted
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        //if interrupted set to zero in case of funky rouge command
        driveTrain.tankDrive(0, 0);
    }
}
