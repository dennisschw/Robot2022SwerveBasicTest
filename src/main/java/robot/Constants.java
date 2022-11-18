// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

public final class Constants {

    // ***************************** SwerveModule Constants **********************************
    public static final class SwerveModuleConstants {
        
        // Drive Wheel Constant
        public static final double kWheelDiameterMeters = Units.inchesToMeters(4);      // 4 Inch wheel

        // Drive Motor/Encoder Constants    

        // ****************************************************************
        //
        //      4096 Motor Encoder Counts per MOTOR revolution
        //    * 6.75 gear ratio - Motor revolutions to 1 wheel revolution
        //  --------
        //  = 27,648 Motor Encoder Counts Per WHEEL Revolution
        // 
        //      4.00  Inches Wheel Diameter
        //     12.56 Inches Wheel Circumfrence
        //      0.319024 Meters Wheel Circumfrence
        //   / 27648 Divide by Motor Encoder Counts Per Wheel Rotation
        //  --------
        //   = 0.0000115387731 Meters Traveled Per Motor Encoder Count
        //
        // ****************************************************************
        public static final double kDriveMotorGearRatio = 1 / 6.75;
        public static final double kDriveEncoderCountsPerRev = 4096;
        public static final double kDriveEncoderDistancePerUnitMeters = 0.0000115387731;

        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters; // ???
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;                     // ??

        // Turning Motor Constants
        public static final double kTurningMotorGearRatio = 1 / 21.428;     // Spec Sheet 150/7 : 1
        public static final double kTurningMotorEncoderCountsPerRev = 4096;
        public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;   // ?????????????
        public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;  // ?????????????

        // PID Constant
        public static final double kPTurning = 0.5;
    }

    // ***************************** DriveTrain Constants **********************************
    public static final class DriveTrainConstants {

        public static final double kTrackWidth = Units.inchesToMeters(23.75); // Between right and left wheels
        public static final double kWheelBase = Units.inchesToMeters(23.75);  // Between front and back wheels

        public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
                new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, kTrackWidth / 2));

        public static final int kFrontLeftDriveMotorPort = 8;
        public static final int kBackLeftDriveMotorPort = 2;
        public static final int kFrontRightDriveMotorPort = 6;
        public static final int kBackRightDriveMotorPort = 4;

        public static final int kFrontLeftTurningMotorPort = 7;
        public static final int kBackLeftTurningMotorPort = 1;
        public static final int kFrontRightTurningMotorPort = 5;
        public static final int kBackRightTurningMotorPort = 3;

        public static final boolean kFrontLeftTurningEncoderReversed = true;
        public static final boolean kBackLeftTurningEncoderReversed = true;
        public static final boolean kFrontRightTurningEncoderReversed = true;
        public static final boolean kBackRightTurningEncoderReversed = true;

        public static final boolean kFrontLeftDriveEncoderReversed = true;
        public static final boolean kBackLeftDriveEncoderReversed = true;
        public static final boolean kFrontRightDriveEncoderReversed = false;
        public static final boolean kBackRightDriveEncoderReversed = false;

        public static final int kFrontLeftDriveAbsoluteEncoderPort = 0;
        public static final int kBackLeftDriveAbsoluteEncoderPort = 2;
        public static final int kFrontRightDriveAbsoluteEncoderPort = 1;
        public static final int kBackRightDriveAbsoluteEncoderPort = 3;

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false;
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = false;
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = false;
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = false;

        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = -0.254;
        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = -1.252;
        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = -1.816;
        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = -4.811;

        public static final double kPhysicalMaxSpeedMetersPerSecond = 5;
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;

        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = //
                kPhysicalMaxAngularSpeedRadiansPerSecond / 4;
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3;
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3;

        
        // Note: inch * 0.0254 = meters.
        // Note: Meter * 39.3701 = Inches

        // The maximum velocity of the robot in meters per second.
        // This is a measure of how fast the robot should be able to drive in a straight line.
        // The formula for calculating the theoretical maximum velocity is:
        // <Motor free speed RPM> / 60 * <Drive reduction> * <Wheel diameter meters> * pi

        // public static final double MOTOR_FREE_SPEED = 6380.0;         // Falcon 500 RPM at free rotation
        // public static final double SWERVE_DRIVE_GEAR_RATIO = 6.75;    // MK4i Swerve Drive middle speed gear ratio
        // public static final double WHEEL_DIAM_INCHES = 4.0 * Math.PI;      // Wheel Diam Inches
        // public static final double WHEEL_DIAM_METERS = WHEEL_DIAM_INCHES * 0.0254;  // Wheel Diam  Meters
        // public static final double WHEEL_CIRC_INCHES = WHEEL_DIAM_INCHES * Math.PI; // Wheel Circumfrence Inches
        // public static final double WHEEL_CIRC_METERS = WHEEL_CIRC_INCHES * 0.0254;
        // public static final double MAX_VELOCITY_METERS_PER_SECOND = 
        //         ((MOTOR_FREE_SPEED / 60.0) / SWERVE_DRIVE_GEAR_RATIO) * WHEEL_CIRC_METERS;
        // public static final double DRIVETRAIN_WHEELBASE_INCHES = 23.75;
        // public static final double DRIVETRAIN_WHEELBASE_METERS =  DRIVETRAIN_WHEELBASE_INCHES * 0.0254;
        // public static final double DRIVETRAIN_TRACKWIDTH_INCHES = 23.75;  
        // public static final double DRIVETRAIN_TRACKWIDTH_METERS = DRIVETRAIN_TRACKWIDTH_INCHES * 0.0254;
    }

    
    // ***************************** Autonomous Constants **********************************
    public static final class AutoConstants {
        public static final double kMaxSpeedMetersPerSecond = DriveTrainConstants.kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kMaxAngularSpeedRadiansPerSecond = //
        DriveTrainConstants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
        public static final double kMaxAccelerationMetersPerSecondSquared = 3;
        public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;
        public static final double kPXController = 1.5;
        public static final double kPYController = 1.5;
        public static final double kPThetaController = 3;

        public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
                new TrapezoidProfile.Constraints(
                        kMaxAngularSpeedRadiansPerSecond,
                        kMaxAngularAccelerationRadiansPerSecondSquared);
    }

    
    // ***************************** OI Constants **********************************
    public static final class OIConstants {
        public static final int kDriverControllerPort = 0;

        public static final int kDriverYAxis = 1;
        public static final int kDriverXAxis = 0;
        public static final int kDriverRotAxis = 4;
        public static final int kDriverFieldOrientedButtonIdx = 1;

        public static final double kDeadband = 0.05;
    }
}

