package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.Robot;

public class DriveCommand extends Command{
    private final DriveSubsystem driveSubsystem;
    public DriveCommand() {

    }
    
    protected void initialize() {
        Robot.driveSubsystem.stop();
    }

    protected void execute() {
        Robot.driveSubsystem.driveJoystick(Robot.m_oi.getDriverStick(), 1);
    }
   
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.driveSubsystem.stop();
    }

    protected void interrupted() {
        end();
    }

	public static void start() {
	}
}   