package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class RobotMovement {

    private DcMotor backLeft,backRight,frontRight,frontLeft;


    public RobotMovement(){
    }

    public RobotMovement(DcMotor backLeft, DcMotor backRight, DcMotor frontLeft, DcMotor frontRight){
        this.backLeft = backLeft;
        this.backRight = backRight;
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
    }

    /*
    NOTE:Left motors are reversed
    Normal operation for left motors is turning backwards
    Normal operation for right motors is turning forward
    If you want left motors to go forward, you have to provide a negative value.
     */
    public void moveStraightForward(double speed){
        backLeft.setPower(-1 * speed);
        backRight.setPower(speed);
        frontLeft.setPower(-1 * speed);
        frontRight.setPower(speed);
    }

    public void moveStraightBackward(double speed){
        backLeft.setPower(speed);
        backRight.setPower(-1 * speed);
        frontLeft.setPower(speed);
        frontRight.setPower(-1 * speed);
    }

    public void strafeLeft(double speed){
        backLeft.setPower(-1 * speed);
        backRight.setPower(-1 * speed);
        frontLeft.setPower(speed);
        frontRight.setPower(speed);
    }

    public void strafeRight(double speed){
        backLeft.setPower(speed);
        backRight.setPower(speed);
        frontLeft.setPower(-1 * speed);
        frontRight.setPower(-1 * speed);
    }

    public void diagonalForwardLeft(double speed){
        backLeft.setPower(-1 * speed);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(speed);
    }

    public void diagonalForwardRight(double speed){
        backLeft.setPower(0);
        backRight.setPower(speed);
        frontLeft.setPower(-1 * speed);
        frontRight.setPower(0);
    }

    public void diagonalBackwardLeft(double speed){
        backLeft.setPower(0);
        backRight.setPower(-1 * speed);
        frontLeft.setPower(speed);
        frontRight.setPower(0);
    }

    public void diagonalBackwardRight(double speed){
        backLeft.setPower(speed);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(-1 * speed);
    }

    public void turnLeft(double speed){
        backLeft.setPower(speed);
        backRight.setPower(speed);
        frontLeft.setPower(speed);
        frontRight.setPower(speed);
    }

    public void turnRight(double speed){
        turnLeft(-1 *  speed);
    }


    public void stopMovement(){
        backLeft.setPower(0);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(0);
    }

    public void testBackLeft(double speed) {
        backLeft.setPower(speed);
    }

    public void testBackRight(double speed) {
        backRight.setPower(speed);
    }

    public void testFrontLeft(double speed) {
        frontLeft.setPower(speed);
    }

    public void testFrontRight(double speed) {
        frontRight.setPower(speed);
    }
}
