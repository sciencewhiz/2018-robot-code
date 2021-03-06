package wclaw;

import org.usfirst.frc4014.powerup.OI;
import org.usfirst.frc4014.powerup.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class WheeledClaw extends Subsystem{

	private OI oi;
	private double clawSpeed = 1;
	
	public WheeledClaw(OI oi) {
		this.oi = oi;
		oi.clawButton.whenPressed(new IntakeCube(this));
		oi.wheelClawReleaseButton.whenPressed(new OutputCube(this));
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	protected void intake() {
		RobotMap.clawMotorA.set(clawSpeed);
		RobotMap.clawMotorB.set(-clawSpeed);
	}
	
	protected void output() {
		RobotMap.clawMotorA.set(-clawSpeed);
		RobotMap.clawMotorB.set(clawSpeed);
	}

}
