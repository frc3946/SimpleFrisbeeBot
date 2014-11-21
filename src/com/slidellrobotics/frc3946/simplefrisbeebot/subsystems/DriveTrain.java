
package com.slidellrobotics.frc3946.simplefrisbeebot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.slidellrobotics.frc3946.simplefrisbeebot.RobotMap;
import com.slidellrobotics.frc3946.simplefrisbeebot.commands.TankDriveWithJoysticks;

/**
 *
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private RobotDrive robotDrive = new RobotDrive(RobotMap.leftDriveMotor, RobotMap.rightDriveMotor);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new TankDriveWithJoysticks());
    }
    
    public void tankDrive(double left, double right)
    {
        robotDrive.tankDrive(left, right);
    }
}

