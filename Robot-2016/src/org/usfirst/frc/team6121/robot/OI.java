// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.commands.ArcadeDrive;
import org.usfirst.frc.team6121.robot.commands.AutonomousCommand;
import org.usfirst.frc.team6121.robot.commands.CloseArm;
import org.usfirst.frc.team6121.robot.commands.DriveStraight;
import org.usfirst.frc.team6121.robot.commands.MoveArmDown;
import org.usfirst.frc.team6121.robot.commands.MoveArmUp;
import org.usfirst.frc.team6121.robot.commands.OpenArm;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton armDownButton;
    public JoystickButton armUpButton;
    public JoystickButton armOpenButton;
    public JoystickButton armCloseButton;
    public Joystick xBoxControl;
    public double leftCal;
    public double rightCal;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
    	
    	//SmartDashboard.putString("DB/String 5", "Slider 0 = left cal");
    	//SmartDashboard.putString("DB/String 6", "Slider 1 = right cal");
    	
    	//double leftCal = SmartDashboard.getNumber("DB/Slider 0", 1.0);
    	//double rightCal = SmartDashboard.getNumber("DB/Slider 1", 1.0);
    	//SmartDashboard.putNumber("DB/Slider 0", leftCal);
    	//SmartDashboard.putNumber("DB/Slider 1", rightCal);
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xBoxControl = new Joystick(0);
        
        armCloseButton = new JoystickButton(xBoxControl, 2);
        armCloseButton.whileHeld(new CloseArm());
        armOpenButton = new JoystickButton(xBoxControl, 3);
        armOpenButton.whileHeld(new OpenArm());
        armUpButton = new JoystickButton(xBoxControl, 4);
        armUpButton.whileHeld(new MoveArmUp());
        armDownButton = new JoystickButton(xBoxControl, 1);
        armDownButton.whileHeld(new MoveArmDown());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Move Arm Up", new MoveArmUp());
        SmartDashboard.putData("Move Arm Down", new MoveArmDown());
        SmartDashboard.putData("Open Arm", new OpenArm());
        SmartDashboard.putData("Close Arm", new CloseArm());
        SmartDashboard.putData("Arcade Drive", new ArcadeDrive());
        SmartDashboard.putData("Drive Straight", new DriveStraight());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getXBoxControl() {
        return xBoxControl;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

