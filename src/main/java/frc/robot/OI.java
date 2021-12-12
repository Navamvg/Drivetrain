package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

    // Instantiation of joysticks

    Joystick driverStick = new Joystick(RobotMap.driveStick);
    Joystick operatorStick = new Joystick(1);

    // Joystick accessors

    public Joystick getDriverStick(){
        return driverStick;

    }

    public Joystick getOperatorStick(){
        return operatorStick;

    }
    
}
