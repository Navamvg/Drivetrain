package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;

public class DriveCommand extends Command {

    public DriveCommand() {

    }

    @Override
    protected void initialize() {
        Robot.DriveSubsystem.stop();
    }

    @Override
    protected void execute() {
        Robot.DriveSubsystem.driveJoystick(Robot.m_oi.getDriverStick(), 1);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.DriveSubsystem.stop();
    }

    @Override
    protected void interrupted();
    end();
}   