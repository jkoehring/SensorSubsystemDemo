
package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.ReportUserButton;

import edu.wpi.first.wpilibj.Utility;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Subsystem that provides access to the User button on the roboRIO.
 */
public class UserButton extends Subsystem
{
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new ReportUserButton());
	}
	
	/**
	 * Reports state of this subsystem on the Smart Dashboard.
	 */
	public void report()
	{
		SmartDashboard.putBoolean("User button", Utility.getUserButton());
	}
}
