package org.usfirst.frc.team4780.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4780.robot.RobotMap;
import org.usfirst.frc.team4780.robot.commands.DriveElevator;

public class Elevator extends Subsystem {
	SpeedController talon = RobotMap.driveElevator;
	



@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	setDefaultCommand(new DriveElevator());
	
}
public void DriveElevator(Joystick right){
	talon.set(right.getX());
}
}
