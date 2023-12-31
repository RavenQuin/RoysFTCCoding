package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class SampleDriveFile extends LinearOpMode {
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;
    DcMotor leftBase;
    DcMotor leftHinge;
    DcMotor rightBase;
    DcMotor rightHinge
    public static double motorPow = 0.5;

    @Override

    public void runOpMode() throws InterruptedException {
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        leftBase = hardwareMap.get(DcMotor.class, "leftBase");
        leftHinge = hardwareMap.get(DcMotor.class, "leftHinge");
        rightBase = hardwareMap.get(DcMotor.class, "rightBase");
        rightHinge = hardwareMap.get(DcMotor.class, "rightHinge");
        MecanumDrive drive = new MecanumDrive(frontLeft, frontRight, backLeft, backRight);

        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        backRight.setDirection(DcMotorSimple.Direction.REVERSE);
//pee pee poo poo
        waitForStart();
        while(opModeIsActive()){
            drive.moveInTeleop(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x, motorPow);
        }

    }
}
