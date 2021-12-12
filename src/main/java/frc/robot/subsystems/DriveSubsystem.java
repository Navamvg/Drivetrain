// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */

  Talon frontRight = new Talon(RobotMap.frontRight);
  Talon frontLeft = new Talon(RobotMap.frontLeft);
  Talon backRight = new Talon(RobotMap.backRight);
  Talon backLeft = new Talon(RobotMap.backLeft);

  PWM motor = new PWM(1);

  SpeedControllerGroup left = new SpeedControllerGroup(frontLeft, backLeft);
  SpeedControllerGroup right = new SpeedControllerGroup(frontRight, backRight);

  public DifferentialDrive drive;

  public DriveSubsystem() {

    frontRight.setInverted(false);
    frontLeft.setInverted(false);
    backRight.setInverted(false);
    backLeft.setInverted(false);
    drive = new DifferentialDrive(left, right);

  }

  public void driveJoystick(Joystick joystick, double speed){

    drive.arcadeDrive(joystick.getY()*speed, joystick.getX()*speed);

  }

  public void drive(double speed, double rotationSpeed){

    drive.arcadeDrive(speed, rotationSpeed);

  }

  public void stop(){

    drive.stopMotor();

  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
