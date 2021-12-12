package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.Robot;
import frc.robot.RobotContainer;



public class DriveCommand extends CommandBase
{
    private final DriveSubsystem m_driveSubsystem;
    
    public DriveCommand(DriveSubsystem driveSubsystem) {
		m_driveSubsystem = driveSubsystem;
        addRequirements(m_driveSubsystem);

    }

    
    public void execute() {
        m_driveSubsystem.driveJoystick(RobotContainer.m_oi.getDriverStick(), 1);
    }

    
    public boolean isFinished() {
        return false;
    }

    
    public void end() {
        m_driveSubsystem.stop();
    }
 
    public void interrupted() {
        end();
    }
}   
