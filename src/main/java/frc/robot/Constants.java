// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.swervedrivespecialties.swervelib.CANDeviceID;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    /**
     * Canivore bus name
     */
    public static final String kCanivoreBusName = "Canivore";

    /**
     * The left-to-right distance between the drivetrain wheels
     *
     * Should be measured from center to center.
     */
    public static final double DRIVETRAIN_TRACKWIDTH_METERS = 0.63; // 24.75 in
    /**
     * The front-to-back distance between the drivetrain wheels.
     *
     * Should be measured from center to center.
     */
    public static final double DRIVETRAIN_WHEELBASE_METERS = 0.63; // 24.75 in

    public static final CANDeviceID DRIVETRAIN_PIGEON_ID = new CANDeviceID(1, kCanivoreBusName);

    public static final CANDeviceID FRONT_LEFT_MODULE_DRIVE_MOTOR = new CANDeviceID(7, kCanivoreBusName); 
    public static final CANDeviceID FRONT_LEFT_MODULE_STEER_MOTOR = new CANDeviceID(8, kCanivoreBusName); 
    public static final CANDeviceID FRONT_LEFT_MODULE_STEER_ENCODER = new CANDeviceID(4, kCanivoreBusName); 
    public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(0.0); // FIXME Measure and set front left steer offset

    public static final CANDeviceID FRONT_RIGHT_MODULE_DRIVE_MOTOR = new CANDeviceID(1, kCanivoreBusName); 
    public static final CANDeviceID FRONT_RIGHT_MODULE_STEER_MOTOR = new CANDeviceID(2, kCanivoreBusName);
    public static final CANDeviceID FRONT_RIGHT_MODULE_STEER_ENCODER = new CANDeviceID(1, kCanivoreBusName);
    public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(0.0); // FIXME Measure and set front right steer offset

    public static final CANDeviceID BACK_LEFT_MODULE_DRIVE_MOTOR = new CANDeviceID(5, kCanivoreBusName);
    public static final CANDeviceID BACK_LEFT_MODULE_STEER_MOTOR = new CANDeviceID(6, kCanivoreBusName);
    public static final CANDeviceID BACK_LEFT_MODULE_STEER_ENCODER = new CANDeviceID(3, kCanivoreBusName);
    public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(0.0); // FIXME Measure and set back left steer offset

    public static final CANDeviceID BACK_RIGHT_MODULE_DRIVE_MOTOR = new CANDeviceID(3, kCanivoreBusName); 
    public static final CANDeviceID BACK_RIGHT_MODULE_STEER_MOTOR = new CANDeviceID(4, kCanivoreBusName); 
    public static final CANDeviceID BACK_RIGHT_MODULE_STEER_ENCODER = new CANDeviceID(2, kCanivoreBusName);
    public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(0.0); // FIXME Measure and set back right steer offset
}
