// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2667.Robot_2015Mecanum.subsystems;

import org.usfirst.frc2667.Robot_2015Mecanum.Robot;
import org.usfirst.frc2667.Robot_2015Mecanum.RobotMap;
import org.usfirst.frc2667.Robot_2015Mecanum.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drivetrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController frontRight = RobotMap.drivetrainfrontRight;
    SpeedController rearRight = RobotMap.drivetrainrearRight;
    SpeedController rearLeft = RobotMap.drivetrainrearLeft;
    SpeedController frontLeft = RobotMap.drivetrainfrontLeft;
    RobotDrive robotDrive41 = RobotMap.drivetrainRobotDrive41;
    Gyro gyro1 = RobotMap.drivetrainGyro1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ArcadeDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void mecanumDrive(Joystick joystick){
    	//robotDrive41.mecanumDrive_Cartesian(Robot.oi.joystick.getX(), Robot.oi.joystick.getY(), Robot.oi.joystick.getZ(), gyro1.getAngle());
    	robotDrive41.mecanumDrive_Cartesian(Robot.oi.joystick.getX(), Robot.oi.joystick.getY(), Robot.oi.joystick.getZ(), 0);

    }
    
    public void stop(){
    	robotDrive41.mecanumDrive_Cartesian(0,0,0, 0);
    }
    
    // Tank drive does not work for a mcanumDrive. Need to use
    // mecanumDrive Cartesian. Need to use a - value for the y parameter
    // to make the robot drive forward.
    // using the gryro angle make sthe robot try to spin to align itself with a certain direction
    // depending how you position the robot.
    public void driveStraight(){
    	robotDrive41.mecanumDrive_Cartesian(0, -.5, 0, 0);
 //   	robotDrive41.tankDrive(.5, .5);
    }
    
    public void turn180(){
    	robotDrive41.tankDrive(.5, .5);
    }
}

