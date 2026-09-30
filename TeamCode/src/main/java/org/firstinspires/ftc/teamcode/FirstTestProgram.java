package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
@Autonomous
public class FirstTestProgram extends LinearOpMode {

    DcMotor backLeft,backRight,frontRight,frontLeft;

    public void runOpMode() {
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");

        waitForStart();

        moveStraightForward(0.5);


        sleep(1000);

        stopMovement();

        sleep(1000);

        moveStraightForward(0.8);

        sleep(1000);

        stopMovement();



    }

    private void moveStraightForward(double speed){
        backLeft.setPower(-1 * speed);
        backRight.setPower(speed);
        frontLeft.setPower(-1 * speed);
        frontRight.setPower(speed);
    }

    private void stopMovement(){
        backLeft.setPower(0);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(0);
    }
}