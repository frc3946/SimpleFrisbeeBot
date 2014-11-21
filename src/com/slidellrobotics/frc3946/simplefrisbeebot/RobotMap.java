package com.slidellrobotics.frc3946.simplefrisbeebot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    //Joysticks
    public static final int leftJoystick = 1;
    public static final int rightJoystick = 2;

    //RightJS Buttons
    public static final int fireFrisbeeButton = 1;
    public static final int toggleFrisbeeWheelsButton = 2;
    //LeftJS Buttons
    public static final int loadFrisbeeInButton = 2;
    public static final int loadFrisbeeOutButton = 3;

    //Motors
    public static final int leftDriveMotor = 1;
    public static final int rightDriveMotor = 2;
    public static final int rearFrisbeeMotor = 3;
    public static final int frontFrisbeeMotor = 4;
    
    //Relays
    public static final int compressorRelay = 1;
    public static final int loadFrisbeeRelay = 2;
    
    //Pnumatics
    public static final int frisbeePistonRetract = 1;
    public static final int frisbeePistonExtend = 2;
    
    //Digital IO
    public static final int compressorPressureSwitch = 1;
}
