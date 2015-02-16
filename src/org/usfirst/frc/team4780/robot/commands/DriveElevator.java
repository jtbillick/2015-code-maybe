package org.usfirst.frc.team4780.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4780.robot.Robot;
import org.usfirst.frc.team4780.robot.subsystems.Elevator;

public class DriveElevator extends Command{
	public DriveElevator() {
		requires(Robot.elevator);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
