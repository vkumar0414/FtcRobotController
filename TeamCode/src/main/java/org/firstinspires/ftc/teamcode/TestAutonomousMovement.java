package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class TestAutonomousMovement extends OpMode {

    DcMotor backLeft,backRight,frontRight,frontLeft;

    RobotMovement robotMovement;//declare the object of class RobotMovement

    @Override
    public void init() {
        //Get hardware mapping for the motors
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");

        //Instantiate robotMovement object and pass the motor reference
        robotMovement = new RobotMovement(backLeft,backRight,frontLeft,frontRight);

        robotMovement.turnLeft(0.5);

        sleep(1_000);//sleep for one second

        robotMovement.stopMovement();//stop motors

        sleep(1_000);//sleep for one second

        robotMovement.turnRight(0.5);

        sleep(1_000);//sleep for one second

        robotMovement.stopMovement();//stop motors

    }

    @Override
    public void loop() {

    }

    public final void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
