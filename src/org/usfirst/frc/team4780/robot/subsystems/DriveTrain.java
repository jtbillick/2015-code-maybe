package org.usfirst.frc.team4780.robot.subsystems;

import org.usfirst.frc.team4780.robot.RobotMap;
import org.usfirst.frc.team4780.robot.commands.Drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	SpeedController rightMotor = RobotMap.driveTrainRightMotor;
	SpeedController leftMotor = RobotMap.driveTrainLeftMotor;
	RobotDrive robotDrive2 = RobotMap.driveTrainRobotDrive2;
	

		
	
public void initDefaultCommand() {
	setDefaultCommand(new Drive());
	 

		
	}


double Kp = 0.03;
	
public void takeJoystickInputs(Joystick left)	{
		robotDrive2.arcadeDrive(left.getY(), left.getX());
	}
public void stop() {
		robotDrive2.drive(0, 0);
	}
	
public void go() {
	robotDrive2.setSafetyEnabled(false);
	robotDrive2.arcadeDrive(0.5, 0);
	Timer.delay(2);
	robotDrive2.arcadeDrive(0, 0);
	}
}