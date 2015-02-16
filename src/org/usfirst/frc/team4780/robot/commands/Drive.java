package org.usfirst.frc.team4780.robot.commands;



import org.usfirst.frc.team4780.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	//begin written code
	public Drive() {
		//use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}
		
	
	protected void initialize() {
		//called repeatedly when command is scheduled to run
	}
	protected void execute() {
		Robot.driveTrain.takeJoystickInputs(Robot.oi.getRightJoystick());
	}
	protected boolean isFinsished() {
		return false;
		//called once after isFInished returns true
	}
	
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.driveTrain.stop();
		
	}
	protected void interrupted() {
		end();
		}

}

