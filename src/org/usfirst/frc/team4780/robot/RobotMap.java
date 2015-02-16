package org.usfirst.frc.team4780.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static SpeedController driveTrainLeftMotor;
	public static RobotDrive driveTrainRobotDrive2;
	public static SpeedController driveTrainRightMotor;
	public static SpeedController driveElevator;
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static void init() {
		driveTrainLeftMotor = new Talon(1);
		LiveWindow.addActuator("Drive Train", "Left Motor", (Talon) driveTrainLeftMotor);
		
		driveTrainRightMotor = new Talon(0);
		LiveWindow.addActuator("Drive Train", "Left Motor", (Talon) driveTrainRightMotor);
		
		driveTrainRobotDrive2 = new RobotDrive(driveTrainLeftMotor, driveTrainRightMotor);
		
		driveTrainRobotDrive2.setSafetyEnabled(true);
		driveTrainRobotDrive2.setExpiration(0.1);
		driveTrainRobotDrive2.setSensitivity(0.5);
		driveTrainRobotDrive2.setMaxOutput(1.0);
		
		driveElevator = new Talon(3);
	}
}
