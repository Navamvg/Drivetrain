// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  TalonFX frontRight = new TalonFX(RobotMap.frontRight);
  TalonFX frontLeft = new TalonFX(RobotMap.frontLeft);
  TalonFX backRight = new TalonFX(RobotMap.backRight);
  TalonFX backLeft = new TalonFX(RobotMap.backLeft);
  
  PWM motor = new PWM(1);
  
  SpeedControllerGroup left =  new SpeedControllerGroup(frontLeft, backLeft);
  SpeedControllerGroup right = new SpeedControllerGroup(frontRight, backRight);
  
  public DifferentialDrive drive;

  public DriveSubsystem() {

    frontRight.setInverted(true);
    frontLeft.setInverted(false);
    backRight.setInverted(true);
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
