package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.Utilities.SparkMAXMotorGroup;

public class Hardware {
    public CANSparkMax leftDrive1;
	public CANSparkMax leftDrive2;
	public CANSparkMax leftDrive3;
	public CANSparkMax rightDrive1;
	public CANSparkMax rightDrive2;
	public CANSparkMax rightDrive3;

    public SparkMAXMotorGroup leftDriveMotors;
    public SparkMAXMotorGroup rightDriveMotors;

    public Solenoid firstClawStage; 
    public Solenoid secondClawStage; 


    public Hardware() {
        CANSparkMax leftDrive1 = new CANSparkMax(0, MotorType.kBrushless);
        CANSparkMax leftDrive2 = new CANSparkMax(1, MotorType.kBrushless);
        CANSparkMax rightDrive1 = new CANSparkMax(2, MotorType.kBrushless);
        CANSparkMax rightDrive2 = new CANSparkMax(3, MotorType.kBrushless);


        SparkMAXMotorGroup leftDriveMotors = new SparkMAXMotorGroup("Left Drive Motor Group", leftDrive1, leftDrive2);
        SparkMAXMotorGroup rightDriveMotors = new SparkMAXMotorGroup("Right Drive Motor Group", rightDrive1, rightDrive2);

        leftDriveMotors.setIdleMode(IdleMode.kBrake);
        rightDriveMotors.setIdleMode(IdleMode.kBrake);

        firstClawStage = new Solenoid(PneumaticsModuleType.CTREPCM, 1);
        secondClawStage = new Solenoid(PneumaticsModuleType.CTREPCM, 2);

    }


    



}
